package main.onlineBank;

/**
 * There are orbs on an NxM board ('O' denotes orb. 'X' denotes empty slot).
 * <p>
 * Whenever two orbs are in the same column or the same row, you get to erase one of them.
 * <p>
 * Try to erase as many orbs as possible.
 * <p>
 * Find the minimum number of orbs remained on board eventually.
 * <p>
 * e.g.
 * <p>
 * OXOXXO
 * <p>
 * XXXXXO
 * <p>
 * XXXXOX
 * <p>
 * erase (0,0) and get
 * <p>
 * XXOXXO
 * <p>
 * XXXXXO
 * <p>
 * XXXXOX
 * <p>
 * erase (2,0) and get
 * XXXXXO
 * <p>
 * XXXXXO
 * <p>
 * XXXXOX
 * <p>
 * erase (5,0) and get
 * <p>
 * XXXXXX
 * <p>
 * XXXXXO
 * <p>
 * XXXXOX
 * <p>
 * no more moves available. Return 2 e.g.
 * <p>
 * OXOXXO
 * <p>
 * XXXXXO
 * <p>
 * XXOXOX
 * erase(4,2), (2,2), (0,0), (2,0), (5,0)
 * <p>
 * Return 1
 * e.g.
 * OXOXXX
 * <p>
 * XOXXXO
 * <p>
 * XXXOOX
 * <p>
 * erase(0,0), (1,1), (3,2)
 * <p>
 * Return 3
 * <p>
 * Follow-up Build a solver for this board game that erases the as many orbs as possible.
 */
public class OrbsGame {
    //TODO
}
