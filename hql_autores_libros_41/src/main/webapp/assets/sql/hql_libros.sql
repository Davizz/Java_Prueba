-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-06-2022 a las 11:01:55
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hql_libros`
--
CREATE DATABASE IF NOT EXISTS `hql_libros` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `hql_libros`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `author`
--

DROP TABLE IF EXISTS `author`;
CREATE TABLE IF NOT EXISTS `author` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `country` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `author`
--

INSERT INTO `author` (`id`, `country`, `name`) VALUES
(1, 'USA', 'J.D. Salinger'),
(2, 'USA', 'F. Scott. Fitzgerald'),
(3, 'UK', 'Jane Austen'),
(4, 'CANADA', 'Scott Hanselman'),
(5, 'USA', 'Jason N. Gaylord'),
(6, 'INDIA', 'Pranav Rastogi'),
(7, 'CANADA', 'Todd Miranda'),
(8, 'USA', 'Christian Wenz');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE IF NOT EXISTS `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `num_page` int(11) DEFAULT NULL,
  `title` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `year` int(11) DEFAULT NULL,
  `author_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKklnrv3weler2ftkweewlky958` (`author_id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `book`
--

INSERT INTO `book` (`id`, `num_page`, `title`, `year`, `author_id`) VALUES
(1, 400, 'The Catcher in the Rye', 2000, 7),
(2, 300, 'Nine Stories', 2004, 3),
(3, 250, 'Franny and Zooey', 2020, 8),
(4, 198, 'The Great Gatsby', 2008, 4),
(5, 300, 'Tender id the Night', 2010, 1),
(6, 200, 'Pride and Prejudice', 2015, 6),
(7, 250, 'Professional ASP.NET 4.5 in C# and VB', 2022, 2);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
