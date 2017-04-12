function almostIncreasingSequence(s) {
  var ssize = s.length;
  var i = ssize;
  var j;
  while (i--) {
    var c = true;
    j = ssize;
    while (j--) {
      if (j < i || j > i+1) {
        if (s[j] <= s[j-1]) {
          c = false;
          break;
        }
      }
      else if (j == i+1) {
        if (s[j] <= s[j-2]) {
          c = false;
          break;
        }
      }
    }
    if (c) {
      return true;
    }
  }
  return false;
}

