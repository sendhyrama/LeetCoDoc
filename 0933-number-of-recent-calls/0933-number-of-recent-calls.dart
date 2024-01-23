class RecentCounter {
  List<int> _requests = [];

  RecentCounter();

  int ping(int t) {
    _requests.add(t);
    int startTime = t - 3000;

    _requests.removeWhere((time) => time < startTime);

    return _requests.length;
  }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = RecentCounter();
 * int param1 = obj.ping(t);
 */