CREATE DATABASE tienda_motos;
USE tienda_motos;

CREATE TABLE Clientes (
    cliente_id int PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    correo VARCHAR(100),
    telefono VARCHAR(15),
    direccion VARCHAR(100),
);

CREATE TABLE Motos (
    moto_id INT PRIMARY KEY,
    marca VARCHAR(50),
    modelo int,
    precio float,
    estado varchar(30),
);

CREATE TABLE Asesores (
    asesor_id INT PRIMARY KEY,
    nombre VARCHAR(50),
    apellido VARCHAR(50),
    correo VARCHAR(100),
    telefono VARCHAR(15),
    especialidad VARCHAR(50),
	 cliente_id int
	constraint apodo1 foreign key ( cliente_id)
	references Clientes ( cliente_id),
);

CREATE TABLE Pagos (
    pago_id INT PRIMARY KEY,
    monto float,
    fecha date,
    metodo_pago varchar(50),
    cliente_id INT,
    moto_id INT,
    asesor_id INT,
    CONSTRAINT Apodo2 FOREIGN KEY (cliente_id)
	REFERENCES Clientes(cliente_id),
    CONSTRAINT Apodo3 FOREIGN KEY (moto_id)
	REFERENCES Motos(moto_id),
    CONSTRAINT Apodo4 FOREIGN KEY (asesor_id) 
	REFERENCES Asesores(asesor_id),
);

INSERT INTO Clientes (cliente_id, nombre, apellido, correo, telefono, direccion)
VALUES ('000001', 'alex', 'padilla','padilla@gmail.com', '3023659948', 'cr 34 bb 44');

INSERT INTO Motos (moto_id, marca, modelo, precio, estado) VALUES
('01', 'DT 175', 2021, 15000.00, 'nuevo'),
('02', 'RX 115', 2018, 8000.00, 'usado'),
('03', 'NKD Kalima 125', 2022, 5500.00, 'nuevo');

INSERT INTO Asesores (asesor_id, nombre, apellido, correo, telefono, especialidad) VALUES
('101', 'Luis', 'Rodríguez', 'luis.rodriguez@gmail.com', '3125678901', 'Motos deportivas'),
('102', 'María', 'López', 'maria.lopez@gmail.com', '3204567890', 'Motos clásicas');

INSERT INTO Pagos (pago_id, monto, fecha, metodo_pago) VALUES
('111', 8000.00, '2024-10-15', 'efectivo'),
('112', 15000.00, '2024-10-20', 'tarjeta');

SELECT * FROM Motos;
SELECT * FROM Clientes;
SELECT * FROM Asesores;