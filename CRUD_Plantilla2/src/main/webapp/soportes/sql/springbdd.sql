-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-06-2022 a las 09:07:11
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
-- Base de datos: `springbdd`
--
CREATE DATABASE IF NOT EXISTS `springbdd` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `springbdd`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE IF NOT EXISTS `book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `author` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `title` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `cat_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKcpa3bj39l5v3136txpissgppm` (`cat_id`)
) ENGINE=MyISAM AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `book`
--

INSERT INTO `book` (`id`, `author`, `title`, `cat_id`) VALUES
(1, 'Jules Vernes', '20000 lieues sous les mers', NULL),
(2, 'Jacques Verber', 'Les fourmis', 2),
(3, 'Victor Hugo', 'Les misérables', 1),
(4, 'Stephen King', 'Cujo', NULL),
(5, 'La Fontaine', 'Les Fables', NULL),
(6, 'George Sand', 'La petite Fadette', NULL),
(7, 'George Sand', 'Histoire de ma vie', NULL),
(8, 'Guy de Maupassant', 'Bel ami', NULL),
(9, 'François Rabelais', 'Gargantua et Pantagruel', 2),
(10, 'François Rabelais', 'Troisième livre de Pantagruel', NULL),
(11, 'Voltaire', 'Bruto', 1),
(12, 'Gustave Flaubert', 'Madame de Bovary', 1),
(15, 'Jules Vernes', 'Voyage au centre de la terre', NULL),
(16, 'Jules Vernes', 'Le tour du monde en 80 jours', NULL),
(26, 'Molière', 'Les femmes savantes', 7),
(27, 'Molière', 'Le bourgeois gentilhomme', 7),
(28, 'Molière', 'L\'avare', 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `book_details`
--

DROP TABLE IF EXISTS `book_details`;
CREATE TABLE IF NOT EXISTS `book_details` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `page_number` int(11) DEFAULT NULL,
  `publication_year` int(11) DEFAULT NULL,
  `purchase_year` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `book_details`
--

INSERT INTO `book_details` (`id`, `page_number`, `publication_year`, `purchase_year`) VALUES
(1, 205, 1883, 2001),
(2, 208, 1985, 2001),
(3, 450, 1878, 2005),
(4, 380, 1985, 2005),
(5, 205, 1555, 1980),
(6, 180, 1849, 2001),
(7, 205, 1855, 2003),
(8, 206, 1885, 1975),
(9, 250, 1532, 1975),
(10, 180, 1546, 1975),
(11, 210, 1730, 1975),
(12, 300, 1856, 1975),
(15, 290, 1864, 1990),
(16, 320, 1872, 1990);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `category`
--

INSERT INTO `category` (`id`, `category_name`) VALUES
(1, 'Categoría 1'),
(2, 'Categoría 2'),
(7, 'Teatro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_ob8kqyqqgmefl0aco34akdtpe` (`email`),
  UNIQUE KEY `uk_email_unik` (`email`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`id`, `email`, `name`) VALUES
(1, 'ludoviclaisnez@gmail.com', 'Ludovic'),
(2, 'm.pilar.ar78@gmail.com', 'María'),
(3, 'hector@gmail.com', 'HECTOR');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user_book`
--

DROP TABLE IF EXISTS `user_book`;
CREATE TABLE IF NOT EXISTS `user_book` (
  `user_id` bigint(20) NOT NULL,
  `book_id` bigint(20) NOT NULL,
  KEY `FK85pwltn867pjxog1gk5smtqcw` (`book_id`),
  KEY `FKbc0bwdnndnxhct38sinbem0n0` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `user_book`
--

INSERT INTO `user_book` (`user_id`, `book_id`) VALUES
(1, 2),
(1, 3),
(2, 10),
(3, 4);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
