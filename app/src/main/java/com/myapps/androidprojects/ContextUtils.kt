package com.myapps.androidprojects

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.StringRes

class ContextUtils {

    object ContextUtils {
        fun toast(context: Context, data: Any) {
            toast(context, data.toString())
        }

        fun toast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }

        fun toast(context: Context, @StringRes msgRes: Int) {
            Toast.makeText(context, msgRes, Toast.LENGTH_SHORT).show()
        }

        fun startDeepLink(context: Context, path: InternalPath, prefix: String, extras: Bundle) {
            context.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(prefix + path)
                ).putExtras(extras)
            )
        }

        fun startDeepLink(
            context: Context,
            path: InternalPath,
            prefix: String,
            extras: Bundle,
            FLAG: Int
        ) {
            context.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(prefix + path)
                ).putExtras(extras).setFlags(FLAG)
            )
        }

        fun startDeepLink(context: Context, path: InternalPath, prefix: String, FLAG: Int) {
            context.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(prefix + path)
                ).setFlags(FLAG)
            )
        }

        fun startDeepLink(
            activity: Activity,
            path: InternalPath,
            prefix: String,
            extras: Bundle,
            requestCode: Int
        ) {
            activity.startActivityForResult(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(prefix + path)
                ).putExtras(extras), requestCode
            )
        }

        fun startDeepLink(
            activity: Activity,
            path: InternalPath,
            prefix: String,
            extras: Bundle,
            requestCode: Int,
            FLAG: Int
        ) {
            activity.startActivityForResult(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(prefix + path)
                ).putExtras(extras).setFlags(FLAG), requestCode
            )
        }

        fun startDeepLink(
            activity: Activity,
            path: InternalPath,
            extras: Bundle,
            requestCode: Int
        ) {
            startDeepLink(
                activity,
                path,
                "app://" + activity.applicationContext.packageName + ".internal/",
                extras,
                requestCode
            )
        }

        fun startDeepLink(activity: Activity, path: InternalPath, requestCode: Int) {
            startDeepLink(
                activity,
                path,
                "app://" + activity.applicationContext.packageName + ".internal/",
                requestCode
            )
        }

        fun startDeepLink(
            activity: Activity,
            path: InternalPath,
            prefix: String,
            requestCode: Int
        ) {
            startDeepLink(activity, path, prefix, Bundle(), requestCode)
        }

        fun startDeepLink(context: Context, path: InternalPath, extras: Bundle) {
            startDeepLink(
                context,
                path,
                "app://" + context.applicationContext.packageName + ".internal/",
                extras
            )
        }

        fun startDeepLink(context: Context, path: InternalPath, extras: Bundle, FLAG: Int) {
            startDeepLink(
                context,
                path,
                "app://" + context.applicationContext.packageName + ".internal/",
                extras,
                FLAG
            )
        }

        fun startDeepLink(context: Context, path: InternalPath) {
            startDeepLink(
                context,
                path,
                "app://" + context.applicationContext.packageName + ".internal/"
            )
        }

        fun startDeepLink(context: Context, path: InternalPath, FLAG: Int) {
            startDeepLink(
                context,
                path,
                "app://" + context.applicationContext.packageName + ".internal/"
            )
        }

        fun startDeepLink(context: Context, path: InternalPath, prefix: String) {
            startDeepLink(context, path, prefix, Bundle())
        }
    }
}