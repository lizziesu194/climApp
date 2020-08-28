package com.example.climapp.listadoCiudades

import java.util.*
import kotlin.collections.ArrayList

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<DummyItem> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

    private val COUNT = 5

    init {
        // Add some sample items.
        for (j in 1..COUNT) {
            addItem(createDummyItem(j))
        }
    }

    private fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    fun makeConten(args : Array<String>) {
        val ciudades = arrayOf("Asunción","Ciudad del Este","Encarnacion","Loma Plata", "Villarrica")
        for(item in ciudades)
            println(ciudades(item))
    }
    private fun createDummyItem(position: Int, content: String ): DummyItem {
        return   DummyItem(position.toString(), content = makeConten(position))
    }

private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
    // detalle para la ciudad seleccionada
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A dummy item representing a piece of content.
     */
    data class DummyItem(val id: String, val content: String) {
        override fun toString(): String = content
    }
}
