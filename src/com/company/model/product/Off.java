package com.company.model.product;


import com.company.model.status.OffStatus;

import java.util.ArrayList;

    public class Off {
        private static ArrayList<Off> offs = new ArrayList<>();
        private ArrayList<Product> products;
        private String offID;
        private String exactStartTime;
        private String exactEndTime;
        private int offAmount;
        private OffStatus offStatus;

        public Off(String offID, String exactStartTime, String exactEndTime, int offAmount) {
            this.offID = offID;
            this.exactStartTime = exactStartTime;
            this.exactEndTime = exactEndTime;
            this.offAmount = offAmount;
            offStatus = OffStatus.IN_PROCESS_OF_EDITING;
            products = new ArrayList<>();
            offs.add(this);
        }


        public String getOffID() {
            return offID;
        }

        public void setOffID(String offID) {
            this.offID = offID;
        }

        public String getExactStartTime() {
            return exactStartTime;
        }

        public void setExactStartTime(String startTime) {
            this.exactStartTime = exactStartTime;
        }

        public String getExactEndTime() {
            return exactEndTime;
        }

        public void setExactEndTime(String exactEndTime) {
            this.exactEndTime = exactEndTime;
        }

        public int getOffAmount() {
            return offAmount;
        }

        public void setOffAmount(int offAmount) {
            this.offAmount = offAmount;
        }

        public void setOffStatus(OffStatus offStatus) {
            this.offStatus = offStatus;
        }

        public ArrayList<Product> getProducts() {
            return products;
        }

        public void setProducts(ArrayList<Product> products) {
            this.products = products;
        }

        public static ArrayList<Off> getOffs() {
            return offs;
        }

        public static ArrayList<String> getOffIds() {
            ArrayList<String> offIds = new ArrayList<>();
            return offIds;
        }

        public static Off getOffById(String offID) {
            for (Off off : offs) {
                if (off.getOffID().equals(offID)) {
                    return off;
                }
            }
            return null;
        }

}
