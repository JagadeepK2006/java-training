class Solution {
    public int bulbSwitch(int n) {
      if(n == 0)return 0;
      if(n == 1) return 1;
      int num = 0;
      for(int i=1; i*i<=n; i++){
        num++;
      }
      return num;
    }
}
