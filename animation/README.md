
DESCRIPTION:
This program implements a GUI for teaching and explaining how the internet works

What was implemented wrong:

In OnePageFourHalf.java the data encapsulation and decapsualtion is slightly wrong. Once the router recieves the Ethernet Frame from the switch it gets decapsulation in the Datalink layer to be able to process the IP packet and find the destination IP address. Before it gets sent off to the next router, IP packet is encapsulated into an Ethernet frame. This step repeats every time the ethernet frame arrives at a router

How to compile and run the program: 

cd into directory 


cd animation/src

javac ./animation/*.java

java animation/IntroPage

