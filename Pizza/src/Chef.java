class Chef extends Person {
    private int ingredientAmount;

    public Chef(String job, String nationality, int ingredientAmount) {
        super(job, nationality);
        this.ingredientAmount = ingredientAmount;
    }

    public int getIngredientAmount() {
        return ingredientAmount;
    }

    public void setIngredientAmount(int ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }

    
}