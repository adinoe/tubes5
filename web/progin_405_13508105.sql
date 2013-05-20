-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 20, 2013 at 06:33 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `progin_405_13508105`
--

-- --------------------------------------------------------

--
-- Table structure for table `assignee_category`
--

CREATE TABLE IF NOT EXISTS `assignee_category` (
  `id_assignee_c` int(5) NOT NULL AUTO_INCREMENT,
  `id_category` int(5) NOT NULL,
  `id_user` int(5) NOT NULL,
  PRIMARY KEY (`id_assignee_c`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `assignee_category`
--

INSERT INTO `assignee_category` (`id_assignee_c`, `id_category`, `id_user`) VALUES
(1, 3, 1),
(2, 4, 2),
(3, 5, 1),
(4, 4, 3);

-- --------------------------------------------------------

--
-- Table structure for table `assignee_task`
--

CREATE TABLE IF NOT EXISTS `assignee_task` (
  `id_assignee_t` int(5) NOT NULL AUTO_INCREMENT,
  `id_task` int(5) NOT NULL,
  `id_user` int(5) NOT NULL,
  PRIMARY KEY (`id_assignee_t`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `assignee_task`
--

INSERT INTO `assignee_task` (`id_assignee_t`, `id_task`, `id_user`) VALUES
(1, 1, 3),
(2, 2, 3),
(3, 3, 4),
(4, 4, 5);

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

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `id_category` int(5) NOT NULL AUTO_INCREMENT,
  `title` varchar(25) NOT NULL,
  PRIMARY KEY (`id_category`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id_category`, `title`) VALUES
(1, 'Progin'),
(2, 'Kriptografi'),
(3, 'Lain-lain');

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE IF NOT EXISTS `comment` (
  `id_comment` int(8) NOT NULL AUTO_INCREMENT,
  `id_user` int(5) NOT NULL,
  `time` date NOT NULL,
  `content` varchar(160) NOT NULL,
  `id_task` int(5) NOT NULL,
  PRIMARY KEY (`id_comment`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `comment`
--

INSERT INTO `comment` (`id_comment`, `id_user`, `time`, `content`, `id_task`) VALUES
(1, 3, '2013-03-20', 'This is comment broo,,,', 1),
(2, 3, '2013-03-20', 'This is comment again', 2),
(3, 3, '2013-03-20', 'This is comment again', 3),
(4, 3, '2013-03-20', 'This is comment again', 4);

-- --------------------------------------------------------

--
-- Table structure for table `task`
--

CREATE TABLE IF NOT EXISTS `task` (
  `id_user` int(5) NOT NULL,
  `id_task` int(5) NOT NULL,
  `title` varchar(25) NOT NULL,
  `deadline` date NOT NULL,
  `description` varchar(50) NOT NULL,
  `tags` varchar(50) NOT NULL,
  `status` varchar(10) NOT NULL,
  `id_category` int(5) NOT NULL,
  PRIMARY KEY (`id_task`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `task`
--

INSERT INTO `task` (`id_user`, `id_task`, `title`, `deadline`, `description`, `tags`, `status`, `id_category`) VALUES
(3, 1, 'Tubes Progin 1', '2013-02-22', 'Tugas besar HTML dan CSS', 'progin', 'Selesai', 1),
(3, 2, 'Tubes Progin 2', '2013-03-23', 'Tugas besar PHP, MySQL, dan AJAX', 'progin', 'Belum', 1),
(4, 3, 'Tubes Kripto', '2013-03-23', 'Tugas besar kriptografi', 'kriptografi', 'Selesai', 2),
(5, 4, 'Tubes Progin 1', '2013-02-22', 'Tugas besar HTML dan CSS', 'progin', 'Selesai', 1),
(4, 5, 'Tubes Lain2', '2013-03-23', 'Tugas tambahan embuh', 'lain2', 'Selesai', 3);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `fullname` varchar(32) NOT NULL,
  `birthday` date NOT NULL,
  `email` varchar(32) NOT NULL,
  `avatar_path` varchar(64) NOT NULL,
  `id_user` int(5) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`, `fullname`, `birthday`, `email`, `avatar_path`, `id_user`) VALUES
('admin', '12345678', 'Administrator admin', '2013-03-20', 'admin@lisio.com', '/img/avatar/admin.jpg', 1),
('momod', '12345678', 'Moderator momod', '2013-03-20', 'momod@lisio.com', '/img/avatar/momod.jpg', 2),
('adinoe', '12345678', 'Adinoe adinoe', '2013-03-20', 'adinoe@lisio.com', 'img/avatar/adinoe.jpg', 3),
('agungdlgs', '12345678', 'Agung dlgs', '2013-03-20', 'agungdlgs@lisio.com', 'img/avatar/agungdlgs.jpg', 4),
('yudhis', '12345678', 'Yudhis yudhis', '2013-03-20', 'yudhis@lisio.com', 'img/avatar/yudhis.jpg', 5);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
