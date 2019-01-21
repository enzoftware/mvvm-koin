package com.projects.enzoftware.cryptotracker

import android.content.res.Resources
import android.support.v7.widget.RecyclerView
import android.view.View
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher

open class RecyclerViewMatcher constructor(var recyclerViewId: Int) {
    fun atPosition(position: Int): Matcher<View> {
        return atPositionOnView(position, -1)
    }

    private fun atPositionOnView(position: Int, i: Int): Matcher<View> {
        return object : TypeSafeMatcher<View>() {

            var resources: Resources? = null
            var childView: View? = null

            override fun matchesSafely(item: View): Boolean {
                this.resources = item.resources

                if (childView == null) {
                    val recyclerView = item.rootView.findViewById(recyclerViewId) as RecyclerView
                    if (recyclerView != null && recyclerView.id == recyclerViewId) {
                        childView = recyclerView
                                .findViewHolderForAdapterPosition(position)?.itemView
                    } else {
                        return false
                    }
                }

                return if (i == -1) {
                    item === childView
                } else {
                    val targetView = childView?.findViewById<View>(i)
                    item === targetView
                }
            }

            override fun describeTo(description: Description?) {
                var idDescription = Integer.toString(recyclerViewId)
                if (this.resources != null) {
                    idDescription = try {
                        this.resources!!.getResourceName(recyclerViewId)
                    }  catch (var4: Resources.NotFoundException) {
                        String.format("%s (resource name not found)", Integer.valueOf(recyclerViewId))
                    }
                }
                description!!.appendText("with id: $idDescription")
            }

        }
    }

    companion object {
        fun withRecyclerView(recyclerViewId: Int): RecyclerViewMatcher {
            return RecyclerViewMatcher(recyclerViewId)
        }
    }
}