import json
from urllib import response
import typer
import requests
import re as reg
from config import API_URL
from config import API_KEY
from PIL import Image
from io import BytesIO

app = typer.Typer()

@app.command()
def choose_param():
    try:
        URL = API_URL
        print("Find image based on the Sol-date id or earth-date(SOl-1 and Date-2)")
        chosen = int(input())

        #filter the json on basis of sol
        if(chosen==1):
            print("Enter the sol for the image")
            id = input()
            URL += "&sol="+id

        #filter the json on basis of earth date
        if(chosen==2):
            print("Enter the date for the image")
            date = input()
            if reg.match("^\d{4}\-(0?[1-9]|1[012])\-(0?[1-9]|[12][0-9]|3[01])$", date):
                URL += "&earth_date="+date
            else:
                print("Please enter date in correct format(eg.:2015-05-30)")
                choose_param()


        #setting up the url
        URL += "&api_key=" + API_KEY

        print("Sending API request...")
        response = requests.get(URL)

        rc = response.content
        data = json.loads(rc)
    
        #setting the id for the specified photo
        photo = dict()
        print('Enter the id for fetching the photo')
        id_2 = int(input())

        if(chosen==1):
            for i in data['photos']:
                img_src = i['img_src']
                identity = i['id']
                photo[identity] = img_src

        if(chosen==2):
            for i in data['photos']:
                earth_date = ['earth_date']
                identity = i['id']
                photo[identity] = earth_date

        #getting the img url and opening in photo viewer
        print("Fetching Image...")
        image_response = requests.get(photo[id_2])
        image = Image.open(BytesIO(image_response.content))
        image.show()


    except:
        #if any data doesn't match
        print("NOT FOUND, TRY AGAIN.")

if __name__ == "__main__":
    app()
