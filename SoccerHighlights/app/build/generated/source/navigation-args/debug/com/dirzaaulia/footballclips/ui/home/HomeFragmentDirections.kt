package com.dirzaaulia.footballclips.ui.home

import android.os.Bundle
import androidx.navigation.NavDirections
import com.dirzaaulia.footballclips.R
import kotlin.Int
import kotlin.String

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToViewerFragment(
    public val url: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_viewerFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("url", this.url)
        return result
      }
  }

  public companion object {
    public fun actionHomeFragmentToViewerFragment(url: String): NavDirections =
        ActionHomeFragmentToViewerFragment(url)
  }
}
