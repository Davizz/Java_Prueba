-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-07-2022 a las 18:32:31
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `jardineria`
--
CREATE DATABASE IF NOT EXISTS `jardineria` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `jardineria`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(100) COLLATE utf8_bin NOT NULL,
  `Apellido` varchar(100) COLLATE utf8_bin NOT NULL,
  `email` varchar(100) COLLATE utf8_bin NOT NULL,
  `edad` int(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `invernadero`
--

DROP TABLE IF EXISTS `invernadero`;
CREATE TABLE IF NOT EXISTS `invernadero` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) COLLATE utf8_bin NOT NULL,
  `Lugar` varchar(100) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `planta`
--

DROP TABLE IF EXISTS `planta`;
CREATE TABLE IF NOT EXISTS `planta` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre_planta` varchar(100) COLLATE utf8_bin NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `precio` double NOT NULL,
  `invernadero_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `invernadero_id` (`invernadero_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `planta_cliente`
--

DROP TABLE IF EXISTS `planta_cliente`;
CREATE TABLE IF NOT EXISTS `planta_cliente` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `planta_id` bigint(20) NOT NULL,
  `cliente_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `planta_id` (`planta_id`,`cliente_id`),
  KEY `planta_id_2` (`planta_id`),
  KEY `cliente_id` (`cliente_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `semilla`
--

DROP TABLE IF EXISTS `semilla`;
CREATE TABLE IF NOT EXISTS `semilla` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) COLLATE utf8_bin NOT NULL,
  `Origen` varchar(100) COLLATE utf8_bin NOT NULL,
  `cantidad` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `planta`
--
ALTER TABLE `planta`
  ADD CONSTRAINT `planta_ibfk_1` FOREIGN KEY (`invernadero_id`) REFERENCES `invernadero` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `planta_cliente`
--
ALTER TABLE `planta_cliente`
  ADD CONSTRAINT `planta_cliente_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `clientes` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `planta_cliente_ibfk_2` FOREIGN KEY (`planta_id`) REFERENCES `planta` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `semilla`
--
ALTER TABLE `semilla`
  ADD CONSTRAINT `semilla_ibfk_1` FOREIGN KEY (`id`) REFERENCES `planta` (`id`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
