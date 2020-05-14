package com.company.model.product;

 import java.util.ArrayList;

    public class Category {
        private String name;
        private String property;
        private static ArrayList<Category> allCategories = new ArrayList<>();
        private ArrayList<Category> subCategory;
        private ArrayList<Product> productsList;

        public Category(String name){
            this.name = name;
            allCategories.add(this);
        }

        public String getName() {
            return name;
        }

        public Category findCategoryByName(String name){
            for (Category allCategory : allCategories) {
                if(allCategory.getName().equals(name)){
                    return allCategory;
                }
            }
            return null;
        }

        public void addProductToCategory(Product product){
            productsList.add(product);
        }

        public void removeProductFromCategory(Product product){
            productsList.remove(product);
        }

        public void addSubCategory(Category category){
            subCategory.add(category);
        }

        public void removeSubCategory(Category category){
            subCategory.remove(category);
        }

        public void removeCategory(Category category){
            allCategories.remove(category);
        }

        public String getProperty() {
            return property;
        }

        public void setProperty(String property) {
            this.property = property;
        }
    }



