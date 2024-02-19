-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 01:16 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `diane_uwamariya_cbem`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `fname` varchar(23) NOT NULL,
  `lname` varchar(34) NOT NULL,
  `idnumber` int(16) NOT NULL,
  `phone` varchar(13) NOT NULL,
  `gender` varchar(32) NOT NULL,
  `maritalstatus` varchar(23) NOT NULL,
  `DOB` varchar(23) NOT NULL,
  `email` varchar(17) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `course code` int(23) NOT NULL,
  `course title` varchar(100) NOT NULL,
  `description` varchar(60) NOT NULL,
  `credit hours` int(90) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`course code`, `course title`, `description`, `credit hours`) VALUES
(1, 'asdf', 'ASDFGH', 3),
(2, 'fgej', 'slj', 5),
(5, 'sdfgh', 'sdfgh', 4),
(32, 'ds', 'jhg', 8),
(43, 'bvcx', 'oiuy', 9),
(234, 'hd', 'uiyrf', 5);

-- --------------------------------------------------------

--
-- Table structure for table `departments`
--

CREATE TABLE `departments` (
  `department code` int(11) NOT NULL,
  `department name` varchar(11) NOT NULL,
  `department chair` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `departments`
--

INSERT INTO `departments` (`department code`, `department name`, `department chair`) VALUES
(3256, 'fesg', 3),
(24, 'nb', 34),
(345, 'htr', 6),
(234, 'nbnvbc', 546);

-- --------------------------------------------------------

--
-- Table structure for table `events`
--

CREATE TABLE `events` (
  `event name` varchar(11) NOT NULL,
  `date and time` date NOT NULL,
  `location` varchar(70) NOT NULL,
  `description` varchar(90) NOT NULL,
  `organizers` varchar(70) NOT NULL,
  `participation` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `faculty`
--

CREATE TABLE `faculty` (
  `FACULTY_ID` int(23) NOT NULL,
  `name` varchar(40) NOT NULL,
  `contact_information` varchar(50) NOT NULL,
  `department` varchar(130) NOT NULL,
  `title` varchar(70) NOT NULL,
  `courses taught` varchar(100) NOT NULL,
  `research interests` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `faculty`
--

INSERT INTO `faculty` (`FACULTY_ID`, `name`, `contact_information`, `department`, `title`, `courses taught`, `research interests`) VALUES
(1, 'gffffffffffff', 'uky', 'fb', '', 'ytjkt', 'lykt'),
(2, 'jghnf', 'mgn', 'jrtnb', 'lkj', 'qw3e', 'dsfd');

-- --------------------------------------------------------

--
-- Table structure for table `library resources`
--

CREATE TABLE `library resources` (
  `id` int(23) NOT NULL,
  `books` varchar(34) NOT NULL,
  `borrowingrecords` varchar(12) NOT NULL,
  `duedates` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `STUDENT_ID` int(23) NOT NULL,
  `NAME` varchar(29) NOT NULL,
  `dob` varchar(200) NOT NULL,
  `CONTACT INFORMATION` varchar(90) NOT NULL,
  `ENROLLMENT STATUS` varchar(70) NOT NULL,
  `PROGRAM` varchar(90) NOT NULL,
  `GRADUATION DATE` varchar(23) NOT NULL,
  `ACADEMIC ADVISOR` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`STUDENT_ID`, `NAME`, `dob`, `CONTACT INFORMATION`, `ENROLLMENT STATUS`, `PROGRAM`, `GRADUATION DATE`, `ACADEMIC ADVISOR`) VALUES
(1, 'z ', '12/12/2021', 'mnbv', 'mnbvc', 'nbv', '12/12/2021', 'mnb'),
(2, 'diane', '12/09', '09876543', 'admitted', 'bit', '12/09/2026', 'mupenzi'),
(4, 'rte', '17', 'sdfg', 'uyhg', 'wqds', '20', 'cxbvn');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `username` varchar(29) NOT NULL,
  `password` varchar(50) NOT NULL,
  `role` varchar(90) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `password`, `role`) VALUES
(1, 'asdfg', 'sdfg', '\\zsdfghj'),
(2, 'hg', 'mn', 'sdv'),
(5, 'jhy', 'poi', 'qwsd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`course code`);

--
-- Indexes for table `events`
--
ALTER TABLE `events`
  ADD PRIMARY KEY (`event name`);

--
-- Indexes for table `faculty`
--
ALTER TABLE `faculty`
  ADD PRIMARY KEY (`FACULTY_ID`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`STUDENT_ID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `courses`
--
ALTER TABLE `courses`
  MODIFY `course code` int(23) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=235;

--
-- AUTO_INCREMENT for table `faculty`
--
ALTER TABLE `faculty`
  MODIFY `FACULTY_ID` int(23) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `STUDENT_ID` int(23) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
