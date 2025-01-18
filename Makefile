up:
	docker-compose up -d
down-all:
	docker-compose down --rmi all --volumes
deploy-up:
	docker-compose -f docker-compose-deploy.yml up -d
deploy-down-all:
	docker-compose -f docker-compose-deploy.yml down --rmi all --volumes
