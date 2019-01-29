# DeepSpace-2019
This is FRC Team 293's code for the 2019 game: FIRST-Deep Space.

## Installing FRC development tools

Instructions and downloads for FRC development tools, i.e. RobotBuilder, VS Code, WPILib, can be found here:
https://wpilib.screenstepslive.com/s/currentCS/m/getting_started/l/999999-installing-c-and-java-development-tools-for-frc

## Instructions for downloading this Git repository

We'd like commits to github.com to be tagged with the coder's name instead of a common name like "Spike" so if you're working on one of common team laptops, create your own clone of the repository. 
1. Open git GUI and select "Clone Existing Repository".  
1. In "Source Location" input box, enter the project URL, https://github.com/Team293/DeepSpace-2019.git
1. In the "Target Location", enter C:\Users\SPIKE\FRCProjects\ and append a unique folder name that will be created for you, e.g. C:\Users\SPIKE\FRCProjects\Kolb.  

This will create the folder "Kolb" and clone the git project into that folder. Now we want to configure this respository with your name and email. In Git GUI, choose "Options" from the "Edit" menu.  The left side of the window contains configuration options for your just cloned repository while the right side contains configuration options for all repositories on the laptop.  Configure your name and email for the cloned repository (left side), not for Global (the right side).

Run RobotBuilder and open the YAML file in the cloned respository folder.  The RobotBuilder file should be configured to generate the java source code and wiring file in folders relative to the YAML file under your local git repository.  Any commits that you make from there will be properly tagged with your name and email.
  
## Installing Vendor Libraries

Here's a blog post on how to install the Phoenix libraries:
https://phoenix-documentation.readthedocs.io/en/latest/ch05_PrepWorkstation.html#before-installing-phoenix

Download the Windows installer from:
https://github.com/CrossTheRoadElec/Phoenix-Releases/releases/download/Phoenix_v5.12.1.0/CTRE.Phoenix.Framework.v5.12.1.0.zip

Run the installer program in the zip file.
