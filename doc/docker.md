#Command Docker
## Dockerfile

Build Image

	docker build --build-arg version=$VERSION -t shortline/content:$VERSION .

Run container

## Docker-compose
	
Build

	docker compose build

Run
	
	docker-compose up
	docker-compose up -d
	
Stop and delete container

	docker-compose down

Stop container

	docker-compose stop
	
Start container

	docker-compose start

List container

	docker-compose ps
	
List images
	
	docker-compose images
	
Log
	
	docker-compose logs -f [service name]
