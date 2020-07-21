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

	ssh raspberrypi.local

How make auto start script:

https://raspberrypi.stackexchange.com/questions/8734/execute-script-on-start-up
