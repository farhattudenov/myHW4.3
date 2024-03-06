package com.geeks.mycw43.adapter

data class Contact (
    val name: String,
    val type: ContactType,
    val numbers: List<String>
)

enum class ContactType{
    WORK,MOBILE
}