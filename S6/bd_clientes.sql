-- BASE DE DATOS
CREATE DATABASE bd_clientes_prueba;
-- USAR BASE DE DATOS
USE bd_clientes_prueba;
-- TABLA CLIENTES
CREATE TABLE clientes (
    codigo INT PRIMARY KEY AUTO_INCREMENT,
    nombres VARCHAR(50),
    apellidos VARCHAR(75),
    telefono VARCHAR(8),
    direccion VARCHAR(100)
);