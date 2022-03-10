package com.frogobox.admob.ui

import android.widget.RelativeLayout
import com.frogobox.admob.core.IFrogoBannerListener
import com.frogobox.admob.core.IFrogoInterstitialListener
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView


/*
 * Created by faisalamir on 10/03/22
 * FrogoAdmob
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 Frogobox Media Inc.      
 * All rights reserved
 *
 */

interface IFrogoAdmobActivity2 {

    fun showBanner(mAdView: AdView, bannerAdUnitId: String)

    fun showBanner(
        mAdView: AdView,
        bannerAdUnitId: String,
        bannerListener: IFrogoBannerListener
    )

    fun showBannerContainer(
        bannerAdUnitId: String,
        mAdsSize: AdSize,
        container: RelativeLayout
    )

    fun showBannerContainer(
        bannerAdUnitId: String,
        mAdsSize: AdSize,
        container: RelativeLayout,
        bannerListener: IFrogoBannerListener
    )

    fun showInterstitial(interstitialAdUnitId: String)

    fun showInterstitial(
        interstitialAdUnitId: String,
        interstitialListener: IFrogoInterstitialListener
    )

}