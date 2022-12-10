package day17_While_DoWhile;

public class Tasks {
    public static void main(String[] args) {

    }
}
/*

Page
1
of 3
Tasks

2. Write a program that calculates the sum of numbers entered by the
user until user enters a negative number.
hint: you need an infinite loop //while


3. write a program to ask user to enter two number and math operator,
and return the result.
if the operator is invalid operator, ask user to re-enter
the operator until user provides a valid operator (+, -, *, /)
4. Write a program that can print the numbers between 1 ~ N that can
be divisible by 3, 5, and 15.
            if the number can be divisible by 3, 5 and
15,
                then it should only be displayed in
DivisibelBy15' section
            if the number can be divisible by 3 but
cannot be divisible by 15,
                then it should only be displayed in
DivisibelBy3' section
            if the number can be divisible by 5 but
cannot be divisible by 15,
                then it should only be displayed in
DivisibelBy5' section
            EX:
                input: 100
                Output:
                     Divisible By 15 15 30 45
60 75 90
                     Divisible By 5 5 10 20
25 35 40 50 55 65 70 80 85 95 100
                     Divisible By 3 3 6 9 12
18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99





6. Create a class called InsuranceQuote, write a program that can
calculate the insurance cost of a person based on the following info:
1. Ask the user to enter your name
2. Ask the user to enter your gender
(if user enters invalid entry, ask the user
to re-enter until user provides a valid entry)
3. Ask the user if he/she is married(Yes/No)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
4. Ask user to enter your age
(age can not be negative or
greater than 120)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
5. Ask user to enter how many miles he/she
drives in a day
(mileage can not be negative
or less than 5)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
6. Ask the user if he/she wants full coverage
or liability insurance?
7. Ask if he/she had any accidents or claims
in past 5 years (Yes/No)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
8. Ask the user if his/her car has an anti-
theft device (Yes/No)
(if user enters invalid
entry, ask the user to re-enter until user provides a valid entry)
Calculate the price of the insurance and display all the
info of the user
Insurance Quote calculation:
starting prices for liability:
age < 25 ===> 90
age >= 25 ==> 50
miles <= 10 ====> $10
    miles > 10 and miles <= 50 ==>
$30
    miles > 50 ===>  $50
starting prices for full coverage:
age < 25 ===> 160
age >= 25 ==> 120
miles <= 10 ====> $20
    miles > 10 and miles <= 50 ==>
$40
    miles > 50 ===>  $70
    If the car has anti-theft device ==> 5%
discount
    If he/she had any accidents or claims in
past 5 years ===> 15% extra charge
    If he/she never had any accidents or
claims in past 5 years ==> 10% discount
    If he/she is married ==> 5% discount
 */