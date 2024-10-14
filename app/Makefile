setup:
	@gradle wrapper --gradle-version 7.4

clean:
	@./gradlew clean

build:
	@./gradlew clean build

start:
# Makefile

.DEFAULT_GOAL := build-run

install:
	./gradlew install

run-dist:
	# Очистка от результатов предыдущей сборки
	./gradlew clean

build:
	./gradlew build

run:
	./gradlew run

test:
	./gradlew test

report:
	./gradlew jacocoTestReport

lint:
	./gradlew checkstyleMain

build-run: build run

.PHONY: build