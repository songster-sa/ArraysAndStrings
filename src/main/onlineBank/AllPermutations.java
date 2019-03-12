package main.onlineBank;

/**
 * given 2 strings s and t
 * find whether all permutations of t is present as substring in s
 * Example :
 * t-> ab ->all permutations = ab , ba
 * t-> abc ->all permutations - abc, acb, bac, bca, cab, cba
 * t-> abb ->all permutations - abb, bab, bba
 *
 * s-> caba -> true -> if s = cab then false
 *
 * P(n,r) = n! / (n-r)! = (3*2) / (3-2)! = 6/1 = 6
 *
 */
public class AllPermutations {
    //TODO

    // some quick checks are there like length and chars are present or not
    // but after that ... do we have to store all permutations and then check if they exist ? thats layman and too inefficient

}
