package com.example.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Создать базовое веб-приложение с использованием Spring Boot, включающее в себя
основные компоненты: контроллеры, сервисы и репозитории. Приложение должно
быть простым, например, приложение для управления книжной библиотекой с
операциями CRUD (создание, чтение, обновление и удаление) книг.
 */

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

}
