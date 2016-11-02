
clean: ;

docker-images:
	docker build -t aic.testcc -f Dockerfile .

