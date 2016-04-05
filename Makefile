
docker-image:
	docker build .

install:
	cp -a . $(TARGET)/
