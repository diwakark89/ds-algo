package com.problemsolving.hackerrank.basic;


/*
*
* A child is playing a cloud hopping game. In this game, there are sequentially numbered clouds that can be thunderheads or cumulus clouds. The character must jump from cloud to cloud until it reaches the start again.

There is an array of clouds,  and an energy level . The character starts from  and uses  unit of energy to make a jump of size  to cloud . If it lands on a thundercloud, , its energy () decreases by  additional units. The game ends when the character lands back on cloud .

Given the values of , , and the configuration of the clouds as an array , determine the final value of  after the game ends.

Example.

The indices of the path are . The energy level reduces by  for each jump to . The character landed on one thunderhead at an additional cost of  energy units. The final energy level is .

Note: Recall that  refers to the modulo operation. In this case, it serves to make the route circular. If the character is at  and jumps , it will arrive at .

Function Description

Complete the jumpingOnClouds function in the editor below.

jumpingOnClouds has the following parameter(s):

int c[n]: the cloud types along the path
int k: the length of one jump
Returns

int: the energy level remaining.
* */
public class JumpingOnClouds {

    public static void main(String[] args) {
        int [] clouds={0, 0, 1, 0, 0, 1, 1, 0};
        System.out.println(jumpingOnClouds(clouds,3));
    }
    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int n = c.length;
        int i = 0;

        do {
            i = (i + k) % n;   // circular jump
            energy -= 1;       // jump cost

            if (c[i] == 1) {   // thundercloud
                energy -= 2;
            }

        } while (i != 0);      // stop when back to start

        return energy;
    }
}
