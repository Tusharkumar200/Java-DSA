class Trapped_RaingWater{

  public static int TrappedRaingWater(int height[]){
    int n = height.length;
    // calculate left max border -array
    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for(int i=1; i<n;i++){
      leftMax[i] = Math.max(height[i], leftMax[i-1]);
    }
    // calculate right max boundary -array
    int rightMax[] = new int[n];
    rightMax[n-1] = height[n-1];
    for (int i = n-2; i >=0; i--) {
      rightMax[i]= Math.max(height[i],rightMax[i+1]);
    }
    // loop
    // waterLavel = min(leftMax boutnd, rightMax bound)
    // trapped water = waterLevel - height[i]
    return 0;
  }
  public static void main(String[] args){
    int height[] = {4,2,0,6,3,2,5};
    TrappedRaingWater(height);
  }
}
