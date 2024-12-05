package com.littlelemon.menu

class SortHelper {

    fun sortProducts(type: SortType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            SortType.Alphabetically -> productsList.sortAlphabetically()
            SortType.PriceAsc -> productsList.softPriceAsc()
            SortType.PriceDesc -> productsList.softPriceDesc()
        }
    }

    private fun List<ProductItem>.sortAlphabetically(): List<ProductItem> {
        return sortedBy { it.title }
    }

    private fun List<ProductItem>.softPriceAsc(): List<ProductItem> {
        return sortedBy { it.price }
    }

    private fun List<ProductItem>.softPriceDesc(): List<ProductItem> {
        return sortedByDescending { it.price }
    }

}