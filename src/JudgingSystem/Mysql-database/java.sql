-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2017 at 06:28 PM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`, `email`) VALUES
(1, 'moukh', '99999', 'moukh@yahoo.com');

-- --------------------------------------------------------

--
-- Table structure for table `avalable`
--

CREATE TABLE `avalable` (
  `stat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `avalable`
--

INSERT INTO `avalable` (`stat`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `employ`
--

CREATE TABLE `employ` (
  `id` int(11) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employ`
--

INSERT INTO `employ` (`id`, `username`, `password`, `email`) VALUES
(2, 'moukh', '12345', ''),
(6, 'tonu', '12345', 'tonmoy@GMAIL.COM'),
(7, 'moukh01', '11111', 'moukh@gmail.com'),
(8, 'A', '11', 'aaa'),
(9, 'chopol', '11111', 'gthhjj'),
(10, 'rafi', '12345', 'rafi@yahoo.com'),
(11, 'm', 'm', 'm'),
(12, 'shubhom', '12345', 'dfgh'),
(13, 'B', 'A', 'A'),
(14, 'C', 'C', 'C'),
(15, 'Q', 'Q', 'Q'),
(16, 'aa', 'aa', 'a@yahoo.com');

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `id` int(10) NOT NULL,
  `username` varchar(100) NOT NULL,
  `marks` int(100) NOT NULL,
  `Avg` int(100) NOT NULL,
  `Grade` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`id`, `username`, `marks`, `Avg`, `Grade`) VALUES
(24, 'aa', 1, 50, 'D');

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

CREATE TABLE `question` (
  `qu_id` int(11) NOT NULL,
  `question` varchar(200) NOT NULL,
  `a` varchar(200) NOT NULL,
  `b` varchar(200) NOT NULL,
  `c` varchar(200) NOT NULL,
  `d` varchar(200) NOT NULL,
  `ans` varchar(200) NOT NULL,
  `subject` varchar(200) NOT NULL,
  `section` varchar(100) NOT NULL,
  `username` varchar(200) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `question`
--

INSERT INTO `question` (`qu_id`, `question`, `a`, `b`, `c`, `d`, `ans`, `subject`, `section`, `username`, `date`, `time`) VALUES
(6, 'Which of these keyword must be used to inherit a class?', 'final', 'extent', 'static', 'extends', 'extends', 'java', 'i', 'badhan', '0000-00-00', '00:00:00'),
(10, 'what is Coa?', 'c', 'c++', '8086', 'java', '8086', 'coa', 'h', '', '2017-02-18', '13:01:15'),
(12, ' What is the size of wchar_t in C++?', '2', '4', ' 2 or 4', 'based on the number of bits in the system', 'based on the number of bits in the system', 'C++', 'A', '', '2017-02-19', '09:23:57'),
(13, 'Pick the odd one out', 'array type', 'character type', 'boolean type', ' integer type', 'array type', 'C++', 'A', '', '2017-02-19', '09:31:18'),
(14, 'Which datatype is used to represent the absence of parameters?', ' int', 'short', 'void', 'float', 'void', 'C++', 'A', '', '2017-02-19', '09:32:10'),
(15, ' What does a escape code represent?', 'alert', 'backslash', 'tab', 'form feed', 'alert', 'C++', 'A', '', '2017-02-19', '09:32:47'),
(16, 'Which type is best suited to represent the logical values?', 'integer', 'boolean', 'character', 'all of the mentioned', 'boolean', 'C++', 'A', '', '2017-02-19', '09:33:24'),
(17, 'RFGFFGFGFHFH', 'DD', 'CC', 'RRR', 'FFF', 'CC', 'ooAD', 'S', '', '2017-02-19', '12:12:45'),
(18, 'What is inheritance?', 'aaaaa', 'bbbb', 'bbbb', 'xx', 'xx', 'java', 'aa', '', '2017-05-03', '12:39:12');

-- --------------------------------------------------------

--
-- Table structure for table `rules`
--

CREATE TABLE `rules` (
  `id` int(100) NOT NULL,
  `qsize` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rules`
--

INSERT INTO `rules` (`id`, `qsize`) VALUES
(4, 2);

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `sub_id` int(11) NOT NULL,
  `sub` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`sub_id`, `sub`) VALUES
(1, 'java'),
(2, 'coa'),
(6, 'c#'),
(9, 'C++'),
(11, 'ooAD'),
(12, 'BCS'),
(13, 'xxx');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employ`
--
ALTER TABLE `employ`
  ADD PRIMARY KEY (`id`),
  ADD KEY `username` (`username`);

--
-- Indexes for table `marks`
--
ALTER TABLE `marks`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`qu_id`);

--
-- Indexes for table `rules`
--
ALTER TABLE `rules`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `subject`
--
ALTER TABLE `subject`
  ADD PRIMARY KEY (`sub_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `employ`
--
ALTER TABLE `employ`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `marks`
--
ALTER TABLE `marks`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
--
-- AUTO_INCREMENT for table `question`
--
ALTER TABLE `question`
  MODIFY `qu_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT for table `rules`
--
ALTER TABLE `rules`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `subject`
--
ALTER TABLE `subject`
  MODIFY `sub_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
