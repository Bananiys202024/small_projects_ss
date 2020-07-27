# small_projects_ss

Notes of help for Arch linux OS.

Start avahi

	systemctl start avahi-daemon.service

Descover services running on network with help of avahi

	avahi-browse --all --ignore-local --resolve --terminate

Disable 

	systemd-resolved.service

Check ping

	ping raspberrypi.local

Enter to RaspberryPi.Zero

	ssh pi@raspberrypi.local

Show all devices connected to machine on arch linux
	
	ip neigh show
	
Remove information about wi-fi access point 

	cd /etc/netctl
	sudo rm -rf name_of_access_point
	
	
How make auto start script:

https://raspberrypi.stackexchange.com/questions/8734/execute-script-on-start-up


Troubleshooting: Can't login.
	You must use "ssh pi@raspberrypi.local" instead of "ssh  raspberrypi.local
	

<h2>Ubuntu</h2>

Check free ports on Ubuntu 

	lsof -i :3087
	
