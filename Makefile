install:
	chmod +x gradlew
	./gradlew clean install

run-dist:
	./build/install/app/bin/app

check-updates:
	chmod +x gradlew
	./gradlew dependencyUpdates

lint:
	chmod +x gradlew
	./gradlew checkstyleMain

build:
	chmod +x gradlew
	./gradlew clean build