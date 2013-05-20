-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 20, 2013 at 06:24 
-- Server version: 5.1.41
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `lisio`
--

-- --------------------------------------------------------

--
-- Table structure for table `assignee_category`
--

CREATE TABLE IF NOT EXISTS `assignee_category` (
  `id_category` int(5) NOT NULL,
  `id_user` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `assignee_category`
--

INSERT INTO `assignee_category` (`id_category`, `id_user`) VALUES
(1, 4),
(1, 5),
(2, 3),
(2, 5),
(3, 5),
(4, 4),
(4, 5),
(3, 3);

-- --------------------------------------------------------

--
-- Table structure for table `assignee_task`
--

CREATE TABLE IF NOT EXISTS `assignee_task` (
  `id_task` int(5) NOT NULL,
  `id_user` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `assignee_task`
--

INSERT INTO `assignee_task` (`id_task`, `id_user`) VALUES
(1, 4),
(2, 4),
(1, 5),
(2, 5),
(3, 3),
(3, 5),
(5, 3),
(5, 5),
(6, 4);

-- --------------------------------------------------------

--
-- Table structure for table `attachment`
--

CREATE TABLE IF NOT EXISTS `attachment` (
  `id_attachment` int(5) NOT NULL AUTO_INCREMENT,
  `path` varchar(32) NOT NULL,
  `id_task` int(5) NOT NULL,
  PRIMARY KEY (`id_attachment`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `attachment`
--


-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `id_category` int(5) NOT NULL AUTO_INCREMENT,
  `title` varchar(25) NOT NULL,
  `id_user` int(5) NOT NULL,
  PRIMARY KEY (`id_category`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id_category`, `title`, `id_user`) VALUES
(1, 'Kesehatan', 3),
(2, 'Kriptografi', 4),
(3, 'Umum', 4),
(4, 'Programming', 3);

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE IF NOT EXISTS `comment` (
  `id_comment` int(8) NOT NULL AUTO_INCREMENT,
  `id_user` int(5) NOT NULL,
  `time` varchar(15) NOT NULL,
  `content` varchar(160) NOT NULL,
  `id_task` int(5) NOT NULL,
  PRIMARY KEY (`id_comment`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `comment`
--

INSERT INTO `comment` (`id_comment`, `id_user`, `time`, `content`, `id_task`) VALUES
(1, 3, '2013-03-25', 'This is comment di task1', 1),
(2, 3, '2013-03-25', 'This is comment di task2', 2),
(3, 3, '2013-03-29', 'This is comment di task3', 3),
(4, 3, '2013-03-29', 'This is comment di task4', 4),
(5, 3, '2013-03-29', 'This is comment di task5', 5);

-- --------------------------------------------------------

--
-- Table structure for table `task`
--

CREATE TABLE IF NOT EXISTS `task` (
  `id_user` int(5) NOT NULL,
  `id_task` int(5) NOT NULL AUTO_INCREMENT,
  `title` varchar(25) NOT NULL,
  `deadline` varchar(30) NOT NULL,
  `description` varchar(50) NOT NULL,
  `tags` varchar(50) NOT NULL,
  `status` varchar(15) NOT NULL,
  `id_category` int(5) NOT NULL,
  PRIMARY KEY (`id_task`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Dumping data for table `task`
--

INSERT INTO `task` (`id_user`, `id_task`, `title`, `deadline`, `description`, `tags`, `status`, `id_category`) VALUES
(3, 1, 'Tubes Progin 1', '2013-02-22', 'Tugas besar HTML dan CSS', 'progin', 'Completed', 1),
(3, 2, 'Tubes Progin 2', '2013-03-23', 'Tugas besar PHP, MySQL, dan AJAX', 'progin', 'Uncompleted', 1),
(4, 3, 'Tubes Kripto', '2013-03-23', 'Tugas besar kriptografi', 'kriptografi', 'Uncompleted', 2),
(4, 5, 'Tubes Lain2', '2013-03-23', 'Tugas kuliah umum', 'umum', 'Uncompleted', 3),
(3, 6, 'Mengupas Kentang', '2013-03-29', 'Cara Mengupas Kentang', 'Programing,Teori', 'Completed', 4),
(5, 13, 'Tubes MPD', '2013-04-25', 'Tugas Besar MPD', 'umum', 'Uncompleted', 3);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `fullname` varchar(32) NOT NULL,
  `birthday` varchar(20) NOT NULL,
  `email` varchar(32) NOT NULL,
  `avatar` varchar(64) NOT NULL,
  `id_user` int(5) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=23 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`, `fullname`, `birthday`, `email`, `avatar`, `id_user`) VALUES
('admin', '12345678', 'Administrator admin', '1955-September-14', 'admin@lisio.com', 'admin.jpg', 1),
('momod', '12345678', 'Moderator momod', '1955-September-14', 'momod@lisio.com', 'momod.jpg', 2),
('adinoe', '12345678', 'Adinoe adinoe', '1955-September-14', 'adinoe@lisio.com', 'adinoe.jpg', 3),
('agungdlgs', '12345678', 'Agung dlgs', '1955-September-14', 'agungdlgs@lisio.com', 'agungdlgs.jpg', 4),
('yudhis', '12345678', 'Yudhis yudhis', '1955-September-14', 'yudhis@lisio.com', 'yudhis.jpg', 5),
('otniel', '12345678', 'otniel simbolon', '1967-January-1', 'otnieldocs@gmail.com', 'amerta.jpg', 21),
('fanny1988', '12345678', 'Fanny Ghasanny', '1988-November-12', 'fgash@gmail.com', 'fanny.jpg', 22);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
