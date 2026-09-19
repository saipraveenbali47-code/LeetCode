class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int cx = xCenter - Math.max(x1, Math.min(xCenter, x2));
        int cy = yCenter - Math.max(y1, Math.min(yCenter, y2));
        int distance = (cx * cx) + (cy * cy);
        return distance <= radius * radius;
    }
}