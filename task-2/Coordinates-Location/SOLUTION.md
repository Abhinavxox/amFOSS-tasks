
# Location Coordinates

The code used are:


```
  mkdir Coordinates-Location
```
```
  cd Coor*
```
```
  mkdir North
```
```
  cd N* 
```
```
  echo "9॰" > NDegree.txt
```
```
  echo 5\" > NMinutes.txt
```
```
  echo 38\" > NSeconds.txt
```
```
  cat NDegree.txt NMinutes.txt NSeconds.txt > NorthCoordinate.txt
```
```
  cd ..
```
```
  cp North/NorthCoordinate.txt .
```
```
  mv NorthCoordinate.txt North.txt
```
```
  mkdir East
```
```
  cd E* 
```
```
  echo "76॰" > EDegree.txt
```
```
  echo 29\" > EMinutes.txt
```
```
  echo 30\" > ESeconds.txt
```
```
  cat EDegree.txt EMinutes.txt ESeconds.txt > EastCoordinate.txt
```
```
  cd ..
```
```
  cp East/EastCoordinate.txt .
```
```
  mv EastCoordinate.txt East.txt
```
```
  cat North.txt East.txt > Location-Coordinate.txt
```

## Screenshots

![alt text](https://github.com/Abhinavxox/amfoss-tasks/blob/main/task-1/Coordinates-Location/SS.png?raw=true)


## Git Commands

```
  git add task-1
  git commit -m task1
  git push
```
