package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import java.util.ArrayList;

import static com.Discord.DiscordBot.Units.QuestionBank.unit1Questions;

public class Unit1 {

    public static int numUnit1Questions;

    // Replace unit4Questions with unit1Questions.add
    public static void initializeUnit1Questions() {
        unit1Questions.add(new Question(
                "Absolute advantage refers to",
                "The ability to produce a good at a lower opportunity cost",
                "The ability to produce more of a good with the same resources",
                "The ability to consume more goods than others",
                "Having superior technology in all production",
                "B", 1, 3005, "easy"));

        unit1Questions.add(new Question(
                "Comparative advantage occurs when a country can produce a good",
                "In greater quantity than others",
                "At a lower opportunity cost than others",
                "Using fewer total resources",
                "Of higher quality than others",
                "B", 1, 3006, "medium"));

        unit1Questions.add(new Question(
                "The law of increasing opportunity costs explains why the production possibilities curve is",
                "A straight line", "Bowed outward", "Bowed inward", "Vertical",
                "B", 1, 3007, "medium"));

        unit1Questions.add(new Question(
                "In the circular flow model, households provide which of the following to the resource market?",
                "Goods and services", "Factors of production", "Tax revenues", "Government services",
                "B", 1, 3008, "easy"));

        unit1Questions.add(new Question(
                "Which economic system relies primarily on customs and traditions to answer the three basic economic questions?",
                "Command economy", "Market economy", "Traditional economy", "Mixed economy",
                "C", 1, 3009, "easy"));

        unit1Questions.add(new Question(
                "Rational decision-making in economics assumes that individuals",
                "Always make perfect decisions",
                "Make choices that maximize their satisfaction given constraints",
                "Never consider opportunity costs",
                "Base decisions solely on emotions",
                "B", 1, 3010, "medium"));

        unit1Questions.add(new Question(
                "Which of the following would cause the production possibilities curve to shift outward?",
                "Unemployment decreases",
                "Resources are reallocated more efficiently",
                "New technology is developed",
                "Production moves from inside to on the curve",
                "C", 1, 3011, "medium"));

        unit1Questions.add(new Question(
                "The 'what to produce' question is primarily about",
                "Choosing the right technology",
                "Deciding which goods and services to make",
                "Determining who gets the output",
                "Selecting production locations",
                "B", 1, 3012, "easy"));

        unit1Questions.add(new Question(
                "Specialization and trade lead to",
                "Greater self-sufficiency",
                "Higher opportunity costs",
                "Increased total output through comparative advantage",
                "More government intervention",
                "C", 1, 3013, "easy"));

        unit1Questions.add(new Question(
                "In a market economy, prices serve as",
                "Signals about relative scarcity",
                "Tools for income redistribution",
                "Fixed values determined by government",
                "Measures of absolute advantage",
                "A", 1, 3014, "medium"));

        unit1Questions.add(new Question(
                "Which of the following is NOT a factor of production?",
                "Land", "Labor", "Capital", "Money",
                "D", 1, 3015, "easy"));

        unit1Questions.add(new Question(
                "The concept of thinking at the margin means considering",
                "Total costs only",
                "Average costs only",
                "The additional costs and benefits of a decision",
                "Historical costs only",
                "C", 1, 3016, "medium"));

        unit1Questions.add(new Question(
                "Which point on a production possibilities curve represents the most efficient use of resources?",
                "A point inside the curve",
                "A point on the curve",
                "A point outside the curve",
                "The midpoint of the curve",
                "B", 1, 3017, "easy"));

        unit1Questions.add(new Question(
                "In the circular flow model, businesses receive _____ from households in the product market",
                "Factors of production", "Goods and services", "Revenue", "Tax payments",
                "C", 1, 3018, "medium"));

        unit1Questions.add(new Question(
                "Which of the following would be considered capital in economic terms?",
                "A $100 bill", "A factory building", "A natural river", "An entrepreneur's idea",
                "B", 1, 3019, "easy"));

        unit1Questions.add(new Question(
                "The three basic economic questions are what to produce, how to produce, and",
                "When to produce", "Why to produce", "For whom to produce", "Where to produce",
                "C", 1, 3020, "easy"));

        unit1Questions.add(new Question(
                "Positive economics is primarily concerned with",
                "What should be", "Value judgments", "Facts and cause-effect relationships", "Normative statements",
                "C", 1, 3021, "medium"));

        unit1Questions.add(new Question(
                "Which of the following is an example of a normative economic statement?",
                "Unemployment is currently 5%",
                "When prices rise, quantity demanded falls",
                "The government should reduce taxes",
                "GDP increased by 2% last quarter",
                "C", 1, 3022, "medium"));

        unit1Questions.add(new Question(
                "The opportunity cost of attending college includes",
                "Tuition and books only",
                "Tuition, books, and foregone earnings",
                "Foregone earnings only",
                "Neither tuition nor foregone earnings",
                "B", 1, 3023, "easy"));

        unit1Questions.add(new Question(
                "A straight-line production possibilities curve indicates",
                "Increasing opportunity costs",
                "Constant opportunity costs",
                "Decreasing opportunity costs",
                "No opportunity costs",
                "B", 1, 3024, "hard"));

        unit1Questions.add(new Question(
                "Which of the following would likely lead to economic growth?",
                "A decrease in the labor force",
                "An increase in capital goods production",
                "A movement from inside to on the PPC",
                "A decrease in technology",
                "B", 1, 3025, "medium"));
        numUnit1Questions = unit1Questions.size();
        System.out.println(String.format("There are %d questions in unit 1", numUnit1Questions));
    }

}