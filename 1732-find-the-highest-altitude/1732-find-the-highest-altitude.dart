class Solution {
    int largestAltitude(List<int> gain) {
    int currentAltitude = 0;
    int highestAltitude = 0;

    for (int i = 0; i < gain.length; i++) {
        currentAltitude += gain[i];
        highestAltitude = currentAltitude > highestAltitude ? currentAltitude : highestAltitude;
    }

    return highestAltitude;
  }
}