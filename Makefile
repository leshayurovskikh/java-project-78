.DEFAULT_GOAL := build-run

clean:
	make -C app clean

start:
	make -C app start

build:
	make -C app build

installDist:
	make -C app installDist

run-dist:
	make -C app run-dist

run:
	make -C app run

test:
	make -C app test

report:
	make -C app report

lint:
	make -C app lint

update-deps:
	make -C app update-deps

.PHONY: build