# -*- coding: utf-8 -*-
"""
author Özcan Yüreklioğlu
14.01.2019
"""
#This code is for bubble sort 


def bubbleSort(arr):                           #dizi parametresi
    n=len(arr)                                 #alınan dizinin uzunluğu
    for i in range(n):                         #dış döngü
        for j in range(0,((n-i)-1)):           #iç föngü
            if arr[j]>arr[j+1]:                #karşılaştırma
                arr[j],arr[j+1]=arr[j+1],arr[j]#sıralama
    return arr                                 #diziyi geri döndürme


#-----------------------------------------------------------------------
dizi=[2,3,41,56,23,45]                         #yeni bir dizi
print(bubbleSort(dizi))                        #tanımlamış olduğumuz diziyi sıralama

