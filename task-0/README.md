Why miss out features of windows by just using linux. We can simply dual boot them in the same pc with any memory loss. There are many steps to do carefully but its easy. If you have a single ssd we'll have to divide it into partitions, then install ubuntu in the new partition. But one can face many problems in the doing this. Lets get into the proper method and problem handling.

**SSD PARTITION**

Firstly, we need to separate a partition of our ssd for linux. If you have a single ssd you can divide it using [Disk Mangement](https://docs.microsoft.com/en-us/windows-server/storage/disk-management/overview-of-disk-management#:~:text=Disk%20Management%20is%20a%20system,see%20Extend%20a%20basic%20volume.). 
In Disk Management, follow the steps:

- Select the main drive(C:)

- Right click it and then shrink volume

- Choose the space you want for the new partion(100GB is enough)

- Once the partion is created, right click it and set it up as new drive

Now your partion of 100GB is created the next step is to install Ubuntu in it.

**Preparing Ubuntu**

You need to download ubuntu LTS 20.4 from their website [](https://ubuntu.com/). Next you need a usb drive of minimum 8GB and download [Rufus](https://rufus.ie/en/). Then follow the exact steps:

- Install Rufus and open it

- Select the usb and the iso file you downloaded

![Rufus](https://dev-to-uploads.s3.amazonaws.com/uploads/articles/95y320lbmbv2p2fse6mj.png)

- Select GPT in partion scheme NOT MBR

- Then start it 
Now the preparation is done lets install it.


**INSTALLATION**

Insert the usb in your pc and then restart. After it restarts and you see the logo keep pressing F12 Key and open BIOS menu.

Then enter bios setup and disable secure boot. Again come in BIOS menu and boot the usb drive. Ubuntu logo will come up and a list will come up. Click the first one named ubuntu. Don't worry if you didn't choose any ubuntu will be come by default. Now you should be able to see ubuntu UI. Then follow the exact steps:

- Donot install directly, first check if your sound, wifi connection and everything else is working

- Then you can install ubuntu

- Choose the language and then when you get to the Update and other software panel, tick Normal Installation and Install third-party software

- When you get to Installation type panel, click on SOMETHING ELSE, that way you won't lose any other data

- The next step is very crucial, we need to manipulate the 100GB space and divide it. For this follow the exact steps in this video [VIDEO 1](https://youtu.be/5mfYj6uE1z0).

- You might have created the swap area and Ext4 then set up the location username and password

After this ubuntu should be installed properly in your partition.
But many problems can be faced during the process and the process itself might not be same for you.

**Problem Handling**

**ERROR IN SSD PARTITION:**
When you try to shrink volume of your main drive it might not show more space available although there enough free space.
These can be caused by many files like pagfiles, hibernatefiles, swapfiles, program data and antivirus as well.
Follow these steps carefully in the video if you face these problems.
[VIDEO 2](https://www.youtube.com/watch?v=X-0R7Q_vhmw&t=310s)

**TURN OFF INTEL RST:**
If you get a message to turn off RAID/Intel RST during ubuntu installation then you have to follow a trick.
Follow this [VIDEO 3](https://www.youtube.com/watch?v=wDrCaAdGuMk).

Hope you can successfully dual boot ubuntu and windows. If there were any difficulties or confusion, you can contact me directly.
Also, thankyou so much for reading the whole blog. Hope i take more and give more from this community.
Enjoy!

Refrences:
[Refrence 1](https://youtu.be/5mfYj6uE1z0)
