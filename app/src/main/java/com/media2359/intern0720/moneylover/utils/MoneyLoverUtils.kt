package com.media2359.intern0720.moneylover.utils

import android.content.Context
import com.media2359.intern0720.moneylover.network.AuthenticationService
import com.media2359.intern0720.moneylover.network.MoneyLoverNetwork
import com.media2359.intern0720.moneylover.network.TransactionService

object MoneyLoverUtils {
    var authenticationService: AuthenticationService? = null
    var moneyLoverManager : MoneyLoverManager? = null
    var transactionService: TransactionService? = null

    fun createAuthenticationService()  {
        if (authenticationService == null){
           authenticationService = MoneyLoverNetwork.createService(AuthenticationService::class.java)
        }
    }

    fun createTransactionService() {
        if (transactionService == null){
            transactionService = MoneyLoverNetwork.createService(TransactionService::class.java)
        }
    }

    fun createMoneyLoverManager(context: Context){
        if (moneyLoverManager==null){
            moneyLoverManager = MoneyLoverManager(context)
        }
    }
}