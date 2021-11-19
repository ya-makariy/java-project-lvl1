install:
	./gradlew clean install

run-dist:
	./build/install/app/bin/app

check-updates:
	./gradlew dependencyUpdates

lint:
	./gradlew checkstyleMain

.PHONY: build
build:
	chmod +x gradlew
	./gradlew clean build