package com.kodilla.chinczyk;

import java.util.ArrayList;

public class MapOfMovements {
    private static ArrayList<Field> listOfMovements = new ArrayList<>();

    public static void addListOfMovements() {
        // trasa czerwonego

        listOfMovements.add(0, new Field(10, 6));
        listOfMovements.add(1, new Field(9, 6));
        listOfMovements.add(2, new Field(8, 6));
        listOfMovements.add(3, new Field(7, 6));
        listOfMovements.add(4, new Field(6, 6));
        listOfMovements.add(5, new Field(6, 7));
        listOfMovements.add(6, new Field(6, 8));
        listOfMovements.add(7, new Field(6, 9));
        listOfMovements.add(8, new Field(6, 10));
        listOfMovements.add(9, new Field(5, 10));
        listOfMovements.add(10, new Field(4, 10));
        listOfMovements.add(11, new Field(4, 9));
        listOfMovements.add(12, new Field(4, 8));
        listOfMovements.add(13, new Field(4, 7));
        listOfMovements.add(14, new Field(4, 6));
        listOfMovements.add(15, new Field(3, 6));
        listOfMovements.add(16, new Field(2, 6));
        listOfMovements.add(17, new Field(1, 6));
        listOfMovements.add(18, new Field(0, 6));
        listOfMovements.add(19, new Field(0, 5));
        listOfMovements.add(20, new Field(0, 4));
        listOfMovements.add(21, new Field(1, 4));
        listOfMovements.add(22, new Field(2, 4));
        listOfMovements.add(23, new Field(3, 4));
        listOfMovements.add(24, new Field(4, 4));
        listOfMovements.add(25, new Field(4, 3));
        listOfMovements.add(26, new Field(4, 2));
        listOfMovements.add(27, new Field(4, 1));
        listOfMovements.add(28, new Field(4, 0));
        listOfMovements.add(29, new Field(5, 0));
        listOfMovements.add(30, new Field(6, 0));
        listOfMovements.add(31, new Field(6, 1));
        listOfMovements.add(32, new Field(6, 2));
        listOfMovements.add(33, new Field(6, 3));
        listOfMovements.add(34, new Field(6, 4));
        listOfMovements.add(35, new Field(7, 4));
        listOfMovements.add(36, new Field(8, 4));
        listOfMovements.add(37, new Field(9, 4));
        listOfMovements.add(38, new Field(10, 4));
        listOfMovements.add(39, new Field(10, 5));
        //pola chronione (domki) czerwone
        listOfMovements.add(40, new Field(9, 5));
        listOfMovements.add(41, new Field(8, 5));
        listOfMovements.add(42, new Field(7, 5));
        listOfMovements.add(43, new Field(6, 5));
        // trasa niebieskiego

        listOfMovements.add(44, new Field(4, 10));
        listOfMovements.add(45, new Field(4, 9));
        listOfMovements.add(46, new Field(4, 8));
        listOfMovements.add(47, new Field(4, 7));
        listOfMovements.add(48, new Field(4, 6));
        listOfMovements.add(49, new Field(3, 6));
        listOfMovements.add(50, new Field(2, 6));
        listOfMovements.add(51, new Field(1, 6));
        listOfMovements.add(52, new Field(0, 6));
        listOfMovements.add(53, new Field(0, 5));
        listOfMovements.add(54, new Field(0, 4));
        listOfMovements.add(55, new Field(1, 4));
        listOfMovements.add(56, new Field(2, 4));
        listOfMovements.add(57, new Field(3, 4));
        listOfMovements.add(58, new Field(4, 4));
        listOfMovements.add(59, new Field(4, 3));
        listOfMovements.add(60, new Field(4, 2));
        listOfMovements.add(61, new Field(4, 1));
        listOfMovements.add(62, new Field(4, 0));
        listOfMovements.add(63, new Field(5, 0));
        listOfMovements.add(64, new Field(6, 0));
        listOfMovements.add(65, new Field(6, 1));
        listOfMovements.add(66, new Field(6, 2));
        listOfMovements.add(67, new Field(6, 3));
        listOfMovements.add(68, new Field(6, 4));
        listOfMovements.add(69, new Field(7, 4));
        listOfMovements.add(70, new Field(8, 4));
        listOfMovements.add(71, new Field(9, 4));
        listOfMovements.add(72, new Field(10, 4));
        listOfMovements.add(73, new Field(10, 5));
        listOfMovements.add(74, new Field(10, 6));
        listOfMovements.add(75, new Field(9, 6));
        listOfMovements.add(76, new Field(8, 6));
        listOfMovements.add(77, new Field(7, 6));
        listOfMovements.add(78, new Field(6, 6));
        listOfMovements.add(79, new Field(6, 7));
        listOfMovements.add(80, new Field(6, 8));
        listOfMovements.add(81, new Field(6, 9));
        listOfMovements.add(82, new Field(6, 10));
        listOfMovements.add(83, new Field(5, 10));
        //pola chronione (domki) niebieskie
        listOfMovements.add(84, new Field(5, 9));
        listOfMovements.add(85, new Field(5, 8));
        listOfMovements.add(86, new Field(5, 7));
        listOfMovements.add(87, new Field(5, 6));
        // trasa zoltego
        listOfMovements.add(88, new Field(0, 4));
        listOfMovements.add(89, new Field(1, 4));
        listOfMovements.add(90, new Field(2, 4));
        listOfMovements.add(91, new Field(3, 4));
        listOfMovements.add(92, new Field(4, 4));
        listOfMovements.add(93, new Field(4, 3));
        listOfMovements.add(94, new Field(4, 2));
        listOfMovements.add(95, new Field(4, 1));
        listOfMovements.add(96, new Field(4, 0));
        listOfMovements.add(97, new Field(5, 0));
        listOfMovements.add(98, new Field(6, 0));
        listOfMovements.add(99, new Field(6, 1));
        listOfMovements.add(100, new Field(6, 2));
        listOfMovements.add(101, new Field(6, 3));
        listOfMovements.add(102, new Field(6, 4));
        listOfMovements.add(103, new Field(7, 4));
        listOfMovements.add(104, new Field(8, 4));
        listOfMovements.add(105, new Field(9, 4));
        listOfMovements.add(106, new Field(10, 4));
        listOfMovements.add(107, new Field(10, 5));
        listOfMovements.add(108, new Field(10, 6));
        listOfMovements.add(109, new Field(9, 6));
        listOfMovements.add(110, new Field(8, 6));
        listOfMovements.add(111, new Field(7, 6));
        listOfMovements.add(112, new Field(6, 6));
        listOfMovements.add(113, new Field(6, 7));
        listOfMovements.add(114, new Field(6, 8));
        listOfMovements.add(115, new Field(6, 9));
        listOfMovements.add(116, new Field(6, 10));
        listOfMovements.add(117, new Field(5, 10));
        listOfMovements.add(118, new Field(4, 10));
        listOfMovements.add(119, new Field(4, 9));
        listOfMovements.add(120, new Field(4, 8));
        listOfMovements.add(121, new Field(4, 7));
        listOfMovements.add(122, new Field(4, 6));
        listOfMovements.add(123, new Field(3, 6));
        listOfMovements.add(124, new Field(2, 6));
        listOfMovements.add(125, new Field(1, 6));
        listOfMovements.add(126, new Field(0, 6));
        listOfMovements.add(127, new Field(0, 5));
        //pola chronione (domki) zolte
        listOfMovements.add(128, new Field(1, 5));
        listOfMovements.add(129, new Field(2, 5));
        listOfMovements.add(130, new Field(3, 5));
        listOfMovements.add(131, new Field(4, 6));
        // trasa zielonego
        listOfMovements.add(132, new Field(6, 0));
        listOfMovements.add(133, new Field(6, 1));
        listOfMovements.add(134, new Field(6, 2));
        listOfMovements.add(135, new Field(6, 3));
        listOfMovements.add(136, new Field(6, 4));
        listOfMovements.add(137, new Field(7, 4));
        listOfMovements.add(138, new Field(8, 4));
        listOfMovements.add(139, new Field(9, 4));
        listOfMovements.add(140, new Field(10, 4));
        listOfMovements.add(141, new Field(10, 5));
        listOfMovements.add(142, new Field(10, 6));
        listOfMovements.add(143, new Field(9, 6));
        listOfMovements.add(144, new Field(8, 6));
        listOfMovements.add(145, new Field(7, 6));
        listOfMovements.add(146, new Field(6, 6));
        listOfMovements.add(147, new Field(6, 7));
        listOfMovements.add(148, new Field(6, 8));
        listOfMovements.add(149, new Field(6, 9));
        listOfMovements.add(150, new Field(6, 10));
        listOfMovements.add(151, new Field(5, 10));
        listOfMovements.add(152, new Field(4, 10));
        listOfMovements.add(153, new Field(4, 9));
        listOfMovements.add(154, new Field(4, 8));
        listOfMovements.add(155, new Field(4, 7));
        listOfMovements.add(156, new Field(4, 6));
        listOfMovements.add(157, new Field(3, 6));
        listOfMovements.add(158, new Field(2, 6));
        listOfMovements.add(159, new Field(1, 6));
        listOfMovements.add(160, new Field(0, 6));
        listOfMovements.add(161, new Field(0, 5));
        listOfMovements.add(162, new Field(0, 4));
        listOfMovements.add(163, new Field(1, 4));
        listOfMovements.add(164, new Field(2, 4));
        listOfMovements.add(165, new Field(3, 4));
        listOfMovements.add(166, new Field(4, 4));
        listOfMovements.add(167, new Field(4, 3));
        listOfMovements.add(168, new Field(4, 2));
        listOfMovements.add(169, new Field(4, 1));
        listOfMovements.add(170, new Field(4, 0));
        listOfMovements.add(171, new Field(5, 0));
        //pola chronione (domki) zielone
        listOfMovements.add(172, new Field(5, 1));
        listOfMovements.add(173, new Field(5, 2));
        listOfMovements.add(174, new Field(5, 3));
        listOfMovements.add(175, new Field(5, 4));

        listOfMovements.add(176, new Field(10,10));
        listOfMovements.add(177, new Field(10,9));
        listOfMovements.add(178, new Field(9,10));
        listOfMovements.add(179, new Field(9,9));

        listOfMovements.add(180, new Field(0, 9));
        listOfMovements.add(181, new Field(0, 10));
        listOfMovements.add(182, new Field(1, 9));
        listOfMovements.add(183, new Field(1, 10));

        listOfMovements.add(184, new Field(10, 0));
        listOfMovements.add(185, new Field(10, 1));
        listOfMovements.add(186, new Field(9, 0));
        listOfMovements.add(187, new Field(9, 1));

        listOfMovements.add(188, new Field(10, 0));
        listOfMovements.add(189, new Field(10, 1));
        listOfMovements.add(190, new Field(9, 0));
        listOfMovements.add(191, new Field(9, 1));
    }

    public static ArrayList<Field> getListOfMovements() {
        return listOfMovements;
    }


}
