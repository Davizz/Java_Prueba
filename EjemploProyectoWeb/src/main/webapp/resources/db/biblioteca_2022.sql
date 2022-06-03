-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-05-2022 a las 09:40:58
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
-- Base de datos: `biblioteca_2022`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `book`
--

CREATE TABLE `book` (
  `id` int(11) NOT NULL,
  `title` varchar(225) COLLATE utf8_unicode_ci NOT NULL,
  `year` int(4) NOT NULL,
  `author` varchar(225) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `book`
--

INSERT INTO `book` (`id`, `title`, `year`, `author`) VALUES
(1, 'La isla misteriosa', 1872, 'Julio Verne'),
(2, 'Viaje al centro de la tierra', 1864, 'Julio Verne'),
(3, 'La isla misteriosa', 1875, 'Julio Verne'),
(4, 'De la Tierra a la Luna', 1865, 'Julio Verne'),
(5, 'Los hijos del cápitan Grant', 1867, 'Julio Verne'),
(6, 'Fabulas', 1668, 'La Fontaine'),
(7, 'Gargantúa y Pantagruel', 1534, 'François Rabelais'),
(9, 'Un invierno en Mallorca', 1841, 'George Sand'),
(10, 'Un invierno en Mallorca', 1841, 'George Sand'),
(11, 'Harry Potter y la camara secreta', 1999, 'J.K Rowling'),
(12, 'harry potter y la piedra filosofal', 1997, 'J.K Rowling');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `location`
--

CREATE TABLE `location` (
  `id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL DEFAULT '1',
  `section` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT 'la sección en la que se encuentra el libro',
  `shelf` varchar(10) COLLATE utf8_unicode_ci NOT NULL COMMENT 'Una letra para indicar la estantería'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `location`
--

INSERT INTO `location` (`id`, `quantity`, `section`, `shelf`) VALUES
(1, 1, 'Aventura', 'B01'),
(2, 2, 'Aventura', 'B02'),
(3, 1, 'Aventura', 'B01'),
(4, 1, 'Aventura', 'B02'),
(5, 1, 'Aventura', 'B02'),
(6, 1, 'Fabulas', 'C1'),
(7, 1, 'Novelas', 'D2'),
(9, 2, 'Autobiografias', 'E1'),
(10, 2, 'Autobiografias', 'E1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `state`
--

CREATE TABLE `state` (
  `id` int(11) NOT NULL,
  `book_id` int(11) NOT NULL,
  `state` varchar(225) COLLATE utf8_unicode_ci NOT NULL,
  `year` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `state`
--

INSERT INTO `state` (`id`, `book_id`, `state`, `year`) VALUES
(1, 2, 'Muy mal', 2004),
(2, 2, 'Como nuevo', 2021);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `location`
--
ALTER TABLE `location`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `state`
--
ALTER TABLE `state`
  ADD PRIMARY KEY (`id`),
  ADD KEY `state_ibfk_01` (`book_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `book`
--
ALTER TABLE `book`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `location`
--
ALTER TABLE `location`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `state`
--
ALTER TABLE `state`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `location`
--
ALTER TABLE `location`
  ADD CONSTRAINT `location_ibfk_1` FOREIGN KEY (`id`) REFERENCES `book` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `state`
--
ALTER TABLE `state`
  ADD CONSTRAINT `state_ibfk_1` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
