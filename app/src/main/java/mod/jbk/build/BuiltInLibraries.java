package mod.jbk.build;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import a.a.a.Jp;
import a.a.a.KB;
import a.a.a.ProjectBuilder;
import a.a.a.oB;
import bro.sketchware.SketchApplication;

@SuppressWarnings("SpellCheckingInspection")
public class BuiltInLibraries {
    public static final File EXTRACTED_COMPILE_ASSETS_PATH = new File(SketchApplication.getContext().getFilesDir(), "libs");
    public static final File EXTRACTED_BUILT_IN_LIBRARIES_PATH = new File(EXTRACTED_COMPILE_ASSETS_PATH, "libs");
    public static final File EXTRACTED_BUILT_IN_LIBRARY_DEX_FILES_PATH = new File(EXTRACTED_COMPILE_ASSETS_PATH, "dexs");

    /**
     * None final so that field values won't be optimized into code, and to allow easy changing of library names due to that
     */

    public static String ANDROIDX_ACTIVITY = "activity-1.12.3";
    public static String ANDROIDX_ADS_ADSERVICES = "ads-adservices-1.0.0-beta05";
    public static String ANDROIDX_ADS_ADSERVICES_JAVA = "ads-adservices-java-1.0.0-beta05";
    public static String ANDROIDX_ANNOTATION_EXPERIMENTAL = "annotation-experimental-1.4.1";
    public static String ANDROIDX_ANNOTATION_JVM = "annotation-jvm-1.9.1";
    public static String ANDROIDX_APPCOMPAT = "appcompat-1.7.1";
    public static String ANDROIDX_APPCOMPAT_RESOURCES = "appcompat-resources-1.7.1";
    public static String ANDROIDX_ASYNCLAYOUTINFLATER = "asynclayoutinflater-1.0.0";
    public static String ANDROIDX_BROWSER = "browser-1.8.0";
    public static String ANDROIDX_CARDVIEW = "cardview-1.0.0";
    public static String ANDROIDX_COLLECTION_JVM = "collection-jvm-1.4.2";
    public static String ANDROIDX_CONCURRENT_FUTURES = "concurrent-futures-1.1.0";
    public static String ANDROIDX_CONSTRAINTLAYOUT = "constraintlayout-2.2.1";
    public static String ANDROIDX_CONSTRAINTLAYOUT_CORE = "constraintlayout-core-1.1.1";
    public static String ANDROIDX_COORDINATORLAYOUT = "coordinatorlayout-1.3.0";
    public static String ANDROIDX_CORE = "core-1.18.0-alpha01";
    public static String ANDROIDX_CORE_COMMON = "core-common-2.2.0";
    public static String ANDROIDX_CORE_KTX = "core-ktx-1.18.0-alpha01";
    public static String ANDROIDX_CORE_RUNTIME = "core-runtime-2.2.0";
    public static String ANDROIDX_CORE_VIEWTREE = "core-viewtree-1.0.0";
    public static String ANDROIDX_CREDENTIALS = "credentials-1.2.0-rc01";
    public static String ANDROIDX_CREDENTIALS_PLAY_SERVICES_AUTH = "credentials-play-services-auth-1.2.0-rc01";
    public static String ANDROIDX_CURSORADAPTER = "cursoradapter-1.0.0";
    public static String ANDROIDX_CUSTOMVIEW = "customview-1.1.0";
    public static String ANDROIDX_CUSTOMVIEW_POOLINGCONTAINER = "customview-poolingcontainer-1.0.0";
    public static String DATASTORE_ANDROID = "datastore-android-1.1.7";
    public static String DATASTORE_CORE_ANDROID = "datastore-core-android-1.1.7";
    public static String DATASTORE_CORE_OKIO_JVM = "datastore-core-okio-jvm-1.1.7";
    public static String DATASTORE_PREFERENCES_ANDROID = "datastore-preferences-android-1.1.7";
    public static String DATASTORE_PREFERENCES_CORE_ANDROID = "datastore-preferences-core-android-1.1.7";
    public static String DATASTORE_PREFERENCES_EXTERNAL_PROTOBUF = "datastore-preferences-external-protobuf-1.1.7";
    public static String DATASTORE_PREFERENCES_PROTO = "datastore-preferences-proto-1.1.7";
    public static String ANDROIDX_DOCUMENTFILE = "documentfile-1.0.0";
    public static String ANDROIDX_DRAWERLAYOUT = "drawerlayout-1.1.1";
    public static String ANDROIDX_DYNAMICANIMATION = "dynamicanimation-1.1.0";
    public static String ANDROIDX_EMOJI2 = "emoji2-1.3.0";
    public static String ANDROIDX_EMOJI2_VIEWS_HELPER = "emoji2-views-helper-1.3.0";
    public static String ANDROIDX_EXIFINTERFACE = "exifinterface-1.3.6";
    public static String ANDROIDX_FRAGMENT = "fragment-1.6.1";
    public static String ANDROIDX_GRAPHICS_SHAPES_ANDROID = "graphics-shapes-android-1.0.1";
    public static String ANDROIDX_INTERPOLATOR = "interpolator-1.0.0";
    public static String ANDROIDX_LEGACY_SUPPORT_CORE_UI = "legacy-support-core-ui-1.0.0";
    public static String ANDROIDX_LEGACY_SUPPORT_CORE_UTILS = "legacy-support-core-utils-1.0.0";
    public static String ANDROIDX_LEGACY_SUPPORT_V13 = "legacy-support-v13-1.0.0";
    public static String ANDROIDX_LEGACY_SUPPORT_V4 = "legacy-support-v4-1.0.0";
    public static String LIFECYCLE_COMMON_JVM = "lifecycle-common-jvm-2.9.4";
    public static String LIFECYCLE_LIVEDATA = "lifecycle-livedata-2.9.4";
    public static String LIFECYCLE_LIVEDATA_CORE = "lifecycle-livedata-core-2.9.4";
    public static String LIFECYCLE_PROCESS = "lifecycle-process-2.9.4";
    public static String LIFECYCLE_RUNTIME_ANDROID = "lifecycle-runtime-android-2.9.4";
    public static String LIFECYCLE_SERVICE = "lifecycle-service-2.9.4";
    public static String LIFECYCLE_VIEWMODEL_ANDROID = "lifecycle-viewmodel-android-2.9.4";
    public static String LIFECYCLE_VIEWMODEL_SAVEDSTATE_ANDROID = "lifecycle-viewmodel-savedstate-android-2.9.4";
    public static String ANDROIDX_LOADER = "loader-1.1.0";
    public static String ANDROIDX_LOCALBROADCASTMANAGER = "localbroadcastmanager-1.0.0";
    public static String ANDROIDX_MEDIA = "media-1.0.0";
    public static String ANDROIDX_MULTIDEX = "multidex-2.0.1";
    public static String ANDROIDX_NAVIGATIONEVENT_ANDROID = "navigationevent-android-1.0.2";
    public static String ANDROIDX_RECYCLERVIEW = "recyclerview-1.4.0";
    public static String ANDROIDX_ROOM_COMMON = "room-common-2.2.5";
    public static String ANDROIDX_ROOM_RUNTIME = "room-runtime-2.2.5";
    public static String ANDROIDX_RUNTIME_ANNOTATION_ANDROID = "runtime-annotation-android-1.9.0";
    public static String ANDROIDX_SAVEDSTATE_ANDROID = "savedstate-android-1.3.1";
    public static String ANDROIDX_SLIDINGPANELAYOUT = "slidingpanelayout-1.0.0";
    public static String ANDROIDX_SQLITE = "sqlite-2.1.0";
    public static String ANDROIDX_SQLITE_FRAMEWORK = "sqlite-framework-2.1.0";
    public static String ANDROIDX_STARTUP_RUNTIME = "startup-runtime-1.2.0";
    public static String ANDROIDX_SWIPEREFRESHLAYOUT = "swiperefreshlayout-1.0.0";
    public static String ANDROIDX_TRACING = "tracing-1.2.0";
    public static String ANDROIDX_TRANSITION = "transition-1.5.0";
    public static String ANDROIDX_VECTORDRAWABLE = "vectordrawable-1.1.0";
    public static String ANDROIDX_VECTORDRAWABLE_ANIMATED = "vectordrawable-animated-1.1.0";
    public static String ANDROIDX_VERSIONEDPARCELABLE = "versionedparcelable-1.1.1";
    public static String ANDROIDX_VIEWPAGER = "viewpager-1.0.0";
    public static String ANDROIDX_VIEWPAGER2 = "viewpager2-1.1.0-beta02";
    public static String ANDROIDX_WEBKIT = "webkit-1.12.1";
    public static String ANDROIDX_WORK_RUNTIME = "work-runtime-2.7.0";
    public static String ANDROID_YOUTUBE_PLAYER = "core-13.0.0";
    public static String CHECKER_QUAL = "checker-qual-3.12.0";
    public static String CIRCLEIMAGEVIEW = "circleimageview-3.1.0";
    public static String CODEVIEW = "CodeView-0.4.1";
    public static String CORE_COMMON = "core-common-2.0.3";
    public static String ERROR_PRONE_ANNOTATIONS = "error_prone_annotations-2.41.0";
    public static String FAILUREACCESS = "failureaccess-1.0.1";
    public static String FIREBASE_ANNOTATIONS = "firebase-annotations-17.0.0";
    public static String FIREBASE_APPCHECK = "firebase-appcheck-18.0.0";
    public static String FIREBASE_APPCHECK_INTEROP = "firebase-appcheck-interop-17.1.0";
    public static String FIREBASE_AUTH = "firebase-auth-24.0.1";
    public static String FIREBASE_AUTH_INTEROP = "firebase-auth-interop-20.0.0";
    public static String FIREBASE_COMMON = "firebase-common-22.0.1";
    public static String FIREBASE_COMPONENTS = "firebase-components-19.0.0";
    public static String FIREBASE_DATABASE = "firebase-database-22.0.1";
    public static String FIREBASE_DATABASE_COLLECTION = "firebase-database-collection-18.0.1";
    public static String FIREBASE_DATATRANSPORT = "firebase-datatransport-18.2.0";
    public static String FIREBASE_ENCODERS = "firebase-encoders-17.0.0";
    public static String FIREBASE_ENCODERS_JSON = "firebase-encoders-json-18.0.0";
    public static String FIREBASE_ENCODERS_PROTO = "firebase-encoders-proto-16.0.0";
    public static String FIREBASE_IID_INTEROP = "firebase-iid-interop-17.1.0";
    public static String FIREBASE_INSTALLATIONS = "firebase-installations-18.0.0";
    public static String FIREBASE_INSTALLATIONS_INTEROP = "firebase-installations-interop-17.1.1";
    public static String FIREBASE_MEASUREMENT_CONNECTOR = "firebase-measurement-connector-19.0.0";
    public static String FIREBASE_MESSAGING = "firebase-messaging-25.0.1";
    public static String FIREBASE_STORAGE = "firebase-storage-22.0.1";
    public static String GLIDE = "glide-5.0.5";
    public static String GLIDE_ANNOTATIONS = "annotations-5.0.5";
    public static String GLIDE_DISKLRUCACHE = "disklrucache-5.0.5";
    public static String GLIDE_GIFDECODER = "gifdecoder-5.0.5";
    public static String GOOGLEID = "googleid-1.1.0";
    public static String GSON = "gson-2.13.2";
    public static String GUAVA = "guava-31.1-android";
    public static String HTTP_LEGACY_ANDROID = "http-legacy-android-28";
    public static String INTEGRITY = "integrity-1.3.0";
    public static String J2OBJC_ANNOTATIONS = "j2objc-annotations-1.3";
    public static String JAVAX_INJECT = "javax.inject-1";
    public static String JETBRAINS_ANNOTATIONS = "annotations-23.0.0";
    public static String KOTLINX_COROUTINES_ANDROID = "kotlinx-coroutines-android-1.9.0";
    public static String KOTLINX_COROUTINES_CORE_JVM = "kotlinx-coroutines-core-jvm-1.9.0";
    public static String KOTLINX_COROUTINES_PLAY_SERVICES = "kotlinx-coroutines-play-services-1.9.0";
    public static String KOTLINX_SERIALIZATION_CORE_JVM = "kotlinx-serialization-core-jvm-1.7.3";
    public static String KOTLIN_ANDROID_EXTENSIONS_RUNTIME = "kotlin-android-extensions-runtime-1.9.22";
    public static String KOTLIN_PARCELIZE_RUNTIME = "kotlin-parcelize-runtime-1.9.22";
    public static String KOTLIN_STDLIB = "kotlin-stdlib-2.2.21";
    public static String JSPECIFY = "jspecify-1.0.0";
    public static String JSR305 = "jsr305-3.0.2";
    public static String LOTTIE = "lottie-6.7.1";
    public static String MATERIAL = "material-1.13.0";
    public static String OKHTTP_ANDROID = "okhttp-android-5.3.2";
    public static String OKIO_JVM = "okio-jvm-3.16.4";
    public static String OTPVIEW = "OTPView-0.1.0";
    public static String PATTERN_LOCK_VIEW = "pattern-lock-view";
    public static String PLAY_SERVICES_ADS = "play-services-ads-24.9.0";
    public static String PLAY_SERVICES_ADS_API = "play-services-ads-api-24.9.0";
    public static String PLAY_SERVICES_ADS_BASE = "play-services-ads-base-20.0.0";
    public static String PLAY_SERVICES_ADS_IDENTIFIER = "play-services-ads-identifier-18.0.0";
    public static String PLAY_SERVICES_ADS_LITE = "play-services-ads-lite-20.0.0";
    public static String PLAY_SERVICES_APPSET = "play-services-appset-16.0.1";
    public static String PLAY_SERVICES_AUTH = "play-services-auth-21.5.0";
    public static String PLAY_SERVICES_AUTH_API_PHONE = "play-services-auth-api-phone-18.0.2";
    public static String PLAY_SERVICES_AUTH_BASE = "play-services-auth-base-18.0.10";
    public static String PLAY_SERVICES_BASE = "play-services-base-18.5.0";
    public static String PLAY_SERVICES_BASEMENT = "play-services-basement-18.9.0";
    public static String PLAY_SERVICES_CLOUD_MESSAGING = "play-services-cloud-messaging-17.2.0";
    public static String PLAY_SERVICES_FIDO = "play-services-fido-20.1.0";
    public static String PLAY_SERVICES_GASS = "play-services-gass-20.0.0";
    public static String PLAY_SERVICES_GCM = "play-services-gcm-17.0.0";
    public static String PLAY_SERVICES_IID = "play-services-iid-17.0.0";
    public static String PLAY_SERVICES_LOCATION = "play-services-location-21.3.0";
    public static String PLAY_SERVICES_MAPS = "play-services-maps-20.0.0";
    public static String PLAY_SERVICES_MEASUREMENT_BASE = "play-services-measurement-base-20.1.2";
    public static String PLAY_SERVICES_MEASUREMENT_SDK_API = "play-services-measurement-sdk-api-20.1.2";
    public static String PLAY_SERVICES_PLACES_PLACEREPORT = "play-services-places-placereport-17.1.0";
    public static String PLAY_SERVICES_STATS = "play-services-stats-17.0.2";
    public static String PLAY_SERVICES_TASKS = "play-services-tasks-18.2.0";
    public static String RECAPTCHA = "recaptcha-18.6.1";
    public static String TRANSPORT_API = "transport-api-3.1.0";
    public static String TRANSPORT_BACKEND_CCT = "transport-backend-cct-3.1.9";
    public static String TRANSPORT_RUNTIME = "transport-runtime-3.1.9";
    public static String USER_MESSAGING_PLATFORM = "user-messaging-platform-4.0.0";
    public static String WAVE_SIDE_BAR = "wave-side-bar";

    public static final BuiltInLibrary[] KNOWN_BUILT_IN_LIBRARIES = {
            new BuiltInLibrary(ANDROIDX_ACTIVITY, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_CORE_KTX, ANDROIDX_CORE_VIEWTREE, LIFECYCLE_COMMON_JVM,
                    LIFECYCLE_RUNTIME_ANDROID, LIFECYCLE_VIEWMODEL_ANDROID,
                    LIFECYCLE_VIEWMODEL_SAVEDSTATE_ANDROID, ANDROIDX_NAVIGATIONEVENT_ANDROID,
                    ANDROIDX_SAVEDSTATE_ANDROID, ANDROIDX_TRACING, KOTLINX_COROUTINES_CORE_JVM,
                    KOTLIN_STDLIB), "androidx.activity"),

            new BuiltInLibrary(ANDROIDX_ADS_ADSERVICES, List.of(ANDROIDX_ADS_ADSERVICES_JAVA,
                    ANDROIDX_ANNOTATION_JVM, ANDROIDX_CORE_KTX, KOTLINX_COROUTINES_CORE_JVM,
                    KOTLIN_STDLIB)),

            new BuiltInLibrary(ANDROIDX_ADS_ADSERVICES_JAVA, List.of(ANDROIDX_ADS_ADSERVICES,
                    ANDROIDX_ANNOTATION_JVM, ANDROIDX_CONCURRENT_FUTURES, ANDROIDX_CORE_KTX, GUAVA,
                    KOTLINX_COROUTINES_CORE_JVM, KOTLIN_STDLIB)),

            new BuiltInLibrary(ANDROIDX_ANNOTATION_EXPERIMENTAL, List.of(KOTLIN_STDLIB)),

            new BuiltInLibrary(ANDROIDX_ANNOTATION_JVM, List.of(KOTLIN_STDLIB)),

            new BuiltInLibrary(ANDROIDX_APPCOMPAT, List.of(ANDROIDX_ACTIVITY,
                    ANDROIDX_ANNOTATION_JVM, ANDROIDX_APPCOMPAT_RESOURCES, ANDROIDX_COLLECTION_JVM,
                    ANDROIDX_CORE, ANDROIDX_CORE_KTX, ANDROIDX_CURSORADAPTER, ANDROIDX_CUSTOMVIEW,
                    ANDROIDX_DRAWERLAYOUT, ANDROIDX_EMOJI2, ANDROIDX_EMOJI2_VIEWS_HELPER,
                    ANDROIDX_FRAGMENT, LIFECYCLE_RUNTIME_ANDROID,
                    LIFECYCLE_VIEWMODEL_ANDROID, ANDROIDX_SAVEDSTATE_ANDROID,
                    KOTLIN_STDLIB), "androidx.appcompat"),

            new BuiltInLibrary(ANDROIDX_APPCOMPAT_RESOURCES, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_APPCOMPAT, ANDROIDX_COLLECTION_JVM, ANDROIDX_CORE, ANDROIDX_VECTORDRAWABLE,
                    ANDROIDX_VECTORDRAWABLE_ANIMATED), "androidx.appcompat.resources"),

            new BuiltInLibrary(ANDROIDX_ASYNCLAYOUTINFLATER, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_CORE), "androidx.asynclayoutinflater"),

            new BuiltInLibrary(ANDROIDX_BROWSER, List.of(ANDROIDX_ANNOTATION_EXPERIMENTAL,
                    ANDROIDX_ANNOTATION_JVM, ANDROIDX_COLLECTION_JVM, ANDROIDX_CONCURRENT_FUTURES,
                    ANDROIDX_CORE, ANDROIDX_INTERPOLATOR), "androidx.browser"),

            new BuiltInLibrary(ANDROIDX_CARDVIEW, List.of(ANDROIDX_ANNOTATION_JVM), "androidx.cardview"),

            new BuiltInLibrary(ANDROIDX_COLLECTION_JVM, List.of(ANDROIDX_ANNOTATION_JVM,
                    KOTLIN_STDLIB)),

            new BuiltInLibrary(ANDROIDX_CONCURRENT_FUTURES, List.of(ANDROIDX_ANNOTATION_JVM)),

            new BuiltInLibrary(ANDROIDX_CONSTRAINTLAYOUT, List.of(ANDROIDX_APPCOMPAT,
                    ANDROIDX_CONSTRAINTLAYOUT_CORE, ANDROIDX_CORE), "androidx.constraintlayout.widget"),

            new BuiltInLibrary(ANDROIDX_CONSTRAINTLAYOUT_CORE, List.of(ANDROIDX_ANNOTATION_JVM)),

            new BuiltInLibrary(ANDROIDX_COORDINATORLAYOUT, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_COLLECTION_JVM, ANDROIDX_CORE, ANDROIDX_CUSTOMVIEW,
                    JSPECIFY), "androidx.coordinatorlayout"),

            new BuiltInLibrary(ANDROIDX_CORE, List.of(ANDROIDX_ANNOTATION_EXPERIMENTAL,
                    ANDROIDX_ANNOTATION_JVM, ANDROIDX_COLLECTION_JVM, ANDROIDX_CONCURRENT_FUTURES,
                    ANDROIDX_CORE_KTX, ANDROIDX_CORE_VIEWTREE, ANDROIDX_INTERPOLATOR,
                    LIFECYCLE_COMMON_JVM, LIFECYCLE_RUNTIME_ANDROID, ANDROIDX_TRACING,
                    ANDROIDX_VERSIONEDPARCELABLE, KOTLINX_COROUTINES_CORE_JVM,
                    KOTLIN_STDLIB, JSPECIFY), "androidx.core"),

            new BuiltInLibrary(ANDROIDX_CORE_COMMON, List.of(ANDROIDX_ANNOTATION_JVM)),

            new BuiltInLibrary(ANDROIDX_CORE_KTX, List.of(ANDROIDX_ANNOTATION_JVM, ANDROIDX_CORE,
                    KOTLIN_STDLIB)),

            new BuiltInLibrary(ANDROIDX_CORE_RUNTIME, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_CORE_COMMON)),

            new BuiltInLibrary(ANDROIDX_CORE_VIEWTREE, List.of(KOTLIN_STDLIB), "androidx.core.viewtree"),

            new BuiltInLibrary(ANDROIDX_CREDENTIALS, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_CREDENTIALS_PLAY_SERVICES_AUTH, KOTLINX_COROUTINES_CORE_JVM,
                    KOTLIN_STDLIB), "androidx.credentials"),

            new BuiltInLibrary(ANDROIDX_CREDENTIALS_PLAY_SERVICES_AUTH, List.of(ANDROIDX_CREDENTIALS,
                    GOOGLEID, KOTLIN_STDLIB, PLAY_SERVICES_AUTH, PLAY_SERVICES_FIDO,
                    PLAY_SERVICES_TASKS), "androidx.credentials.play.services.auth"),

            new BuiltInLibrary(ANDROIDX_CURSORADAPTER, List.of(ANDROIDX_ANNOTATION_JVM)),

            new BuiltInLibrary(ANDROIDX_CUSTOMVIEW, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_COLLECTION_JVM, ANDROIDX_CORE)),

            new BuiltInLibrary(ANDROIDX_CUSTOMVIEW_POOLINGCONTAINER, List.of(ANDROIDX_CORE_KTX,
                    KOTLIN_STDLIB), "androidx.customview.poolingcontainer"),

            new BuiltInLibrary(DATASTORE_ANDROID, List.of(ANDROIDX_ANNOTATION_JVM,
                    DATASTORE_CORE_ANDROID, DATASTORE_CORE_OKIO_JVM,
                    DATASTORE_PREFERENCES_ANDROID, DATASTORE_PREFERENCES_CORE_ANDROID,
                    DATASTORE_PREFERENCES_EXTERNAL_PROTOBUF,
                    DATASTORE_PREFERENCES_PROTO, KOTLINX_COROUTINES_CORE_JVM,
                    KOTLIN_STDLIB, OKIO_JVM)),

            new BuiltInLibrary(DATASTORE_CORE_ANDROID, List.of(ANDROIDX_ANNOTATION_JVM,
                    DATASTORE_ANDROID, DATASTORE_CORE_OKIO_JVM,
                    DATASTORE_PREFERENCES_ANDROID, DATASTORE_PREFERENCES_CORE_ANDROID,
                    DATASTORE_PREFERENCES_EXTERNAL_PROTOBUF,
                    DATASTORE_PREFERENCES_PROTO, KOTLINX_COROUTINES_CORE_JVM,
                    KOTLIN_PARCELIZE_RUNTIME, KOTLIN_STDLIB)),

            new BuiltInLibrary(DATASTORE_CORE_OKIO_JVM, List.of(DATASTORE_ANDROID,
                    DATASTORE_CORE_ANDROID, DATASTORE_PREFERENCES_ANDROID,
                    DATASTORE_PREFERENCES_CORE_ANDROID,
                    DATASTORE_PREFERENCES_EXTERNAL_PROTOBUF,
                    DATASTORE_PREFERENCES_PROTO, KOTLINX_COROUTINES_CORE_JVM,
                    KOTLIN_STDLIB, OKIO_JVM)),

            new BuiltInLibrary(DATASTORE_PREFERENCES_ANDROID, List.of(DATASTORE_ANDROID,
                    DATASTORE_CORE_ANDROID, DATASTORE_CORE_OKIO_JVM,
                    DATASTORE_PREFERENCES_CORE_ANDROID,
                    DATASTORE_PREFERENCES_EXTERNAL_PROTOBUF,
                    DATASTORE_PREFERENCES_PROTO, KOTLINX_COROUTINES_CORE_JVM,
                    KOTLIN_STDLIB)),

            new BuiltInLibrary(DATASTORE_PREFERENCES_CORE_ANDROID, List.of(DATASTORE_ANDROID,
                    DATASTORE_CORE_ANDROID, DATASTORE_CORE_OKIO_JVM,
                    DATASTORE_PREFERENCES_ANDROID,
                    DATASTORE_PREFERENCES_EXTERNAL_PROTOBUF,
                    DATASTORE_PREFERENCES_PROTO, KOTLIN_STDLIB, OKIO_JVM)),

            new BuiltInLibrary(DATASTORE_PREFERENCES_EXTERNAL_PROTOBUF, List.of(DATASTORE_ANDROID,
                    DATASTORE_CORE_ANDROID, DATASTORE_CORE_OKIO_JVM,
                    DATASTORE_PREFERENCES_ANDROID, DATASTORE_PREFERENCES_CORE_ANDROID,
                    DATASTORE_PREFERENCES_PROTO)),

            new BuiltInLibrary(DATASTORE_PREFERENCES_PROTO, List.of(DATASTORE_ANDROID,
                    DATASTORE_CORE_ANDROID, DATASTORE_CORE_OKIO_JVM,
                    DATASTORE_PREFERENCES_ANDROID, DATASTORE_PREFERENCES_CORE_ANDROID,
                    DATASTORE_PREFERENCES_EXTERNAL_PROTOBUF)),

            new BuiltInLibrary(ANDROIDX_DOCUMENTFILE, List.of(ANDROIDX_ANNOTATION_JVM)),

            new BuiltInLibrary(ANDROIDX_DRAWERLAYOUT, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_CORE, ANDROIDX_CUSTOMVIEW), "androidx.drawerlayout"),

            new BuiltInLibrary(ANDROIDX_DYNAMICANIMATION, List.of(ANDROIDX_COLLECTION_JVM,
                    ANDROIDX_CORE, JSPECIFY)),

            new BuiltInLibrary(ANDROIDX_EMOJI2, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_COLLECTION_JVM, ANDROIDX_CORE, ANDROIDX_EMOJI2_VIEWS_HELPER,
                    LIFECYCLE_COMMON_JVM, LIFECYCLE_PROCESS,
                    ANDROIDX_STARTUP_RUNTIME)),

            new BuiltInLibrary(ANDROIDX_EMOJI2_VIEWS_HELPER, List.of(ANDROIDX_COLLECTION_JVM,
                    ANDROIDX_CORE, ANDROIDX_EMOJI2)),

            new BuiltInLibrary(ANDROIDX_EXIFINTERFACE, List.of(ANDROIDX_ANNOTATION_JVM)),

            new BuiltInLibrary(ANDROIDX_FRAGMENT, List.of(ANDROIDX_ACTIVITY,
                    ANDROIDX_ANNOTATION_EXPERIMENTAL, ANDROIDX_ANNOTATION_JVM, ANDROIDX_COLLECTION_JVM,
                    ANDROIDX_CORE_KTX, LIFECYCLE_LIVEDATA_CORE,
                    LIFECYCLE_RUNTIME_ANDROID, LIFECYCLE_VIEWMODEL_ANDROID,
                    LIFECYCLE_VIEWMODEL_SAVEDSTATE_ANDROID, ANDROIDX_LOADER,
                    ANDROIDX_SAVEDSTATE_ANDROID, ANDROIDX_VIEWPAGER,
                    KOTLIN_STDLIB), "androidx.fragment"),

            new BuiltInLibrary(ANDROIDX_GRAPHICS_SHAPES_ANDROID, List.of(ANDROIDX_ANNOTATION_EXPERIMENTAL,
                    ANDROIDX_ANNOTATION_JVM, ANDROIDX_COLLECTION_JVM, ANDROIDX_CORE_KTX,
                    KOTLIN_STDLIB)),

            new BuiltInLibrary(ANDROIDX_INTERPOLATOR, List.of(ANDROIDX_ANNOTATION_JVM)),

            new BuiltInLibrary(ANDROIDX_LEGACY_SUPPORT_CORE_UI, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_ASYNCLAYOUTINFLATER, ANDROIDX_COORDINATORLAYOUT, ANDROIDX_CORE,
                    ANDROIDX_CURSORADAPTER, ANDROIDX_CUSTOMVIEW, ANDROIDX_DRAWERLAYOUT,
                    ANDROIDX_INTERPOLATOR, ANDROIDX_LEGACY_SUPPORT_CORE_UTILS,
                    ANDROIDX_SLIDINGPANELAYOUT, ANDROIDX_SWIPEREFRESHLAYOUT, ANDROIDX_VIEWPAGER)),

            new BuiltInLibrary(ANDROIDX_LEGACY_SUPPORT_CORE_UTILS, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_CORE, ANDROIDX_DOCUMENTFILE, ANDROIDX_LOADER,
                    ANDROIDX_LOCALBROADCASTMANAGER)),

            new BuiltInLibrary(ANDROIDX_LEGACY_SUPPORT_V13, List.of(ANDROIDX_LEGACY_SUPPORT_V4)),

            new BuiltInLibrary(ANDROIDX_LEGACY_SUPPORT_V4, List.of(ANDROIDX_CORE,
                    ANDROIDX_FRAGMENT, ANDROIDX_LEGACY_SUPPORT_CORE_UI,
                    ANDROIDX_LEGACY_SUPPORT_CORE_UTILS, ANDROIDX_MEDIA)),

            new BuiltInLibrary(LIFECYCLE_COMMON_JVM, List.of(ANDROIDX_ANNOTATION_JVM,
                    LIFECYCLE_LIVEDATA, LIFECYCLE_LIVEDATA_CORE,
                    LIFECYCLE_PROCESS, LIFECYCLE_RUNTIME_ANDROID, LIFECYCLE_SERVICE,
                    LIFECYCLE_VIEWMODEL_ANDROID, LIFECYCLE_VIEWMODEL_SAVEDSTATE_ANDROID,
                    KOTLINX_COROUTINES_CORE_JVM, KOTLIN_STDLIB, JSPECIFY)),

            new BuiltInLibrary(LIFECYCLE_LIVEDATA, List.of(ANDROIDX_CORE_COMMON,
                    ANDROIDX_CORE_RUNTIME, LIFECYCLE_COMMON_JVM,
                    LIFECYCLE_LIVEDATA_CORE, LIFECYCLE_PROCESS,
                    LIFECYCLE_RUNTIME_ANDROID, LIFECYCLE_SERVICE,
                    LIFECYCLE_VIEWMODEL_ANDROID, LIFECYCLE_VIEWMODEL_SAVEDSTATE_ANDROID,
                    KOTLINX_COROUTINES_CORE_JVM, KOTLIN_STDLIB, JSPECIFY)),

            new BuiltInLibrary(LIFECYCLE_LIVEDATA_CORE, List.of(ANDROIDX_CORE_COMMON,
                    ANDROIDX_CORE_RUNTIME, LIFECYCLE_COMMON_JVM, LIFECYCLE_LIVEDATA,
                    LIFECYCLE_PROCESS, LIFECYCLE_RUNTIME_ANDROID,
                    LIFECYCLE_SERVICE, LIFECYCLE_VIEWMODEL_ANDROID,
                    LIFECYCLE_VIEWMODEL_SAVEDSTATE_ANDROID, KOTLIN_STDLIB, JSPECIFY)),

            new BuiltInLibrary(LIFECYCLE_PROCESS, List.of(ANDROIDX_ANNOTATION_JVM,
                    LIFECYCLE_COMMON_JVM, LIFECYCLE_LIVEDATA,
                    LIFECYCLE_LIVEDATA_CORE, LIFECYCLE_RUNTIME_ANDROID,
                    LIFECYCLE_SERVICE, LIFECYCLE_VIEWMODEL_ANDROID,
                    LIFECYCLE_VIEWMODEL_SAVEDSTATE_ANDROID, ANDROIDX_STARTUP_RUNTIME,
                    KOTLIN_STDLIB)),

            new BuiltInLibrary(LIFECYCLE_RUNTIME_ANDROID, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_CORE_COMMON, ANDROIDX_CORE_RUNTIME, ANDROIDX_CORE_VIEWTREE,
                    LIFECYCLE_COMMON_JVM, LIFECYCLE_LIVEDATA,
                    LIFECYCLE_LIVEDATA_CORE, LIFECYCLE_PROCESS,
                    LIFECYCLE_SERVICE, LIFECYCLE_VIEWMODEL_ANDROID,
                    LIFECYCLE_VIEWMODEL_SAVEDSTATE_ANDROID, KOTLINX_COROUTINES_ANDROID,
                    KOTLIN_STDLIB, JSPECIFY), "androidx.lifecycle.runtime"),

            new BuiltInLibrary(LIFECYCLE_SERVICE, List.of(LIFECYCLE_COMMON_JVM,
                    LIFECYCLE_LIVEDATA, LIFECYCLE_LIVEDATA_CORE,
                    LIFECYCLE_PROCESS, LIFECYCLE_RUNTIME_ANDROID,
                    LIFECYCLE_VIEWMODEL_ANDROID, LIFECYCLE_VIEWMODEL_SAVEDSTATE_ANDROID,
                    KOTLIN_STDLIB)),

            new BuiltInLibrary(LIFECYCLE_VIEWMODEL_ANDROID, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_CORE_VIEWTREE, LIFECYCLE_COMMON_JVM, LIFECYCLE_LIVEDATA,
                    LIFECYCLE_LIVEDATA_CORE, LIFECYCLE_PROCESS,
                    LIFECYCLE_RUNTIME_ANDROID, LIFECYCLE_SERVICE,
                    LIFECYCLE_VIEWMODEL_SAVEDSTATE_ANDROID, KOTLINX_COROUTINES_ANDROID,
                    KOTLINX_COROUTINES_CORE_JVM, KOTLIN_STDLIB), "androidx.lifecycle.viewmodel"),

            new BuiltInLibrary(LIFECYCLE_VIEWMODEL_SAVEDSTATE_ANDROID, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_CORE_KTX, LIFECYCLE_COMMON_JVM, LIFECYCLE_LIVEDATA,
                    LIFECYCLE_LIVEDATA_CORE, LIFECYCLE_PROCESS,
                    LIFECYCLE_RUNTIME_ANDROID, LIFECYCLE_SERVICE,
                    LIFECYCLE_VIEWMODEL_ANDROID, ANDROIDX_SAVEDSTATE_ANDROID,
                    KOTLINX_COROUTINES_ANDROID, KOTLINX_COROUTINES_CORE_JVM,
                    KOTLINX_SERIALIZATION_CORE_JVM, KOTLIN_STDLIB)),

            new BuiltInLibrary(ANDROIDX_LOADER, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_COLLECTION_JVM, ANDROIDX_CORE, LIFECYCLE_LIVEDATA_CORE,
                    LIFECYCLE_VIEWMODEL_ANDROID)),

            new BuiltInLibrary(ANDROIDX_LOCALBROADCASTMANAGER, List.of(ANDROIDX_ANNOTATION_JVM)),

            new BuiltInLibrary(ANDROIDX_MEDIA, List.of(ANDROIDX_ANNOTATION_JVM, ANDROIDX_CORE,
                    ANDROIDX_VERSIONEDPARCELABLE), "androidx.media"),

            new BuiltInLibrary(ANDROIDX_MULTIDEX),

            new BuiltInLibrary(ANDROIDX_NAVIGATIONEVENT_ANDROID, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_CORE_VIEWTREE, ANDROIDX_RUNTIME_ANNOTATION_ANDROID,
                    KOTLINX_COROUTINES_ANDROID, KOTLINX_COROUTINES_CORE_JVM,
                    KOTLIN_STDLIB), "androidx.navigationevent"),

            new BuiltInLibrary(ANDROIDX_RECYCLERVIEW, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_COLLECTION_JVM, ANDROIDX_CORE, ANDROIDX_CUSTOMVIEW,
                    ANDROIDX_CUSTOMVIEW_POOLINGCONTAINER, ANDROIDX_VIEWPAGER2), "androidx.recyclerview"),

            new BuiltInLibrary(ANDROIDX_ROOM_COMMON, List.of(ANDROIDX_ANNOTATION_JVM)),

            new BuiltInLibrary(ANDROIDX_ROOM_RUNTIME, List.of(ANDROIDX_CORE_RUNTIME,
                    ANDROIDX_ROOM_COMMON, ANDROIDX_SQLITE, ANDROIDX_SQLITE_FRAMEWORK)),

            new BuiltInLibrary(ANDROIDX_RUNTIME_ANNOTATION_ANDROID, List.of(KOTLIN_STDLIB)),

            new BuiltInLibrary(ANDROIDX_SAVEDSTATE_ANDROID, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_CORE_KTX, ANDROIDX_CORE_VIEWTREE, LIFECYCLE_COMMON_JVM,
                    KOTLINX_COROUTINES_CORE_JVM, KOTLINX_SERIALIZATION_CORE_JVM,
                    KOTLIN_STDLIB), "androidx.savedstate"),

            new BuiltInLibrary(ANDROIDX_SLIDINGPANELAYOUT, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_CORE, ANDROIDX_CUSTOMVIEW)),

            new BuiltInLibrary(ANDROIDX_SQLITE, List.of(ANDROIDX_ANNOTATION_JVM)),

            new BuiltInLibrary(ANDROIDX_SQLITE_FRAMEWORK, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_SQLITE)),

            new BuiltInLibrary(ANDROIDX_STARTUP_RUNTIME, List.of(ANDROIDX_ANNOTATION_JVM,
                    LIFECYCLE_COMMON_JVM, ANDROIDX_TRACING), "androidx.startup"),

            new BuiltInLibrary(ANDROIDX_SWIPEREFRESHLAYOUT, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_CORE, ANDROIDX_INTERPOLATOR)),

            new BuiltInLibrary(ANDROIDX_TRACING, List.of(ANDROIDX_ANNOTATION_JVM)),

            new BuiltInLibrary(ANDROIDX_TRANSITION, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_COLLECTION_JVM, ANDROIDX_CORE,
                    ANDROIDX_DYNAMICANIMATION), "androidx.transition"),

            new BuiltInLibrary(ANDROIDX_VECTORDRAWABLE, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_COLLECTION_JVM, ANDROIDX_CORE)),

            new BuiltInLibrary(ANDROIDX_VECTORDRAWABLE_ANIMATED, List.of(ANDROIDX_COLLECTION_JVM,
                    ANDROIDX_INTERPOLATOR, ANDROIDX_VECTORDRAWABLE)),

            new BuiltInLibrary(ANDROIDX_VERSIONEDPARCELABLE, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_COLLECTION_JVM)),

            new BuiltInLibrary(ANDROIDX_VIEWPAGER, List.of(ANDROIDX_ANNOTATION_JVM, ANDROIDX_CORE,
                    ANDROIDX_CUSTOMVIEW)),

            new BuiltInLibrary(ANDROIDX_VIEWPAGER2, List.of(ANDROIDX_ANNOTATION_EXPERIMENTAL,
                    ANDROIDX_ANNOTATION_JVM, ANDROIDX_COLLECTION_JVM, ANDROIDX_CORE, ANDROIDX_FRAGMENT,
                    ANDROIDX_RECYCLERVIEW), "androidx.viewpager2"),

            new BuiltInLibrary(ANDROIDX_WEBKIT, List.of(ANDROIDX_ANNOTATION_EXPERIMENTAL,
                    ANDROIDX_ANNOTATION_JVM, ANDROIDX_CORE)),

            new BuiltInLibrary(ANDROIDX_WORK_RUNTIME, List.of(ANDROIDX_ANNOTATION_EXPERIMENTAL,
                    ANDROIDX_CORE, LIFECYCLE_LIVEDATA, LIFECYCLE_SERVICE,
                    ANDROIDX_ROOM_RUNTIME, ANDROIDX_SQLITE, ANDROIDX_SQLITE_FRAMEWORK,
                    ANDROIDX_STARTUP_RUNTIME), "androidx.work"),

            new BuiltInLibrary(ANDROID_YOUTUBE_PLAYER, List.of(KOTLIN_STDLIB),
                    "com.pierfrancescosoffritti.androidyoutubeplayer"),

            new BuiltInLibrary(CHECKER_QUAL),

            new BuiltInLibrary(CIRCLEIMAGEVIEW, List.of(), "de.hdodenhof.circleimageview"),

            new BuiltInLibrary(CODEVIEW, List.of(ANDROIDX_APPCOMPAT), "br.tiagohm.codeview"),

            new BuiltInLibrary(CORE_COMMON, List.of(), "com.google.android.play.corecommon"),

            new BuiltInLibrary(ERROR_PRONE_ANNOTATIONS),

            new BuiltInLibrary(FAILUREACCESS),

            new BuiltInLibrary(FIREBASE_ANNOTATIONS, List.of(JAVAX_INJECT)),

            new BuiltInLibrary(FIREBASE_APPCHECK, List.of(ANDROIDX_ANNOTATION_JVM,
                    FIREBASE_APPCHECK_INTEROP, KOTLIN_STDLIB, PLAY_SERVICES_BASE,
                    PLAY_SERVICES_TASKS), "com.google.firebase.appcheck"),

            new BuiltInLibrary(FIREBASE_APPCHECK_INTEROP, List.of(PLAY_SERVICES_BASE,
                    PLAY_SERVICES_TASKS), "com.google.firebase.appcheck.interop"),

            new BuiltInLibrary(FIREBASE_AUTH, List.of(ANDROIDX_BROWSER, ANDROIDX_COLLECTION_JVM,
                    ANDROIDX_CREDENTIALS, ANDROIDX_CREDENTIALS_PLAY_SERVICES_AUTH, ANDROIDX_FRAGMENT,
                    ANDROIDX_LOCALBROADCASTMANAGER, FIREBASE_ANNOTATIONS, FIREBASE_APPCHECK_INTEROP,
                    FIREBASE_AUTH_INTEROP, FIREBASE_COMMON, FIREBASE_COMPONENTS, INTEGRITY,
                    KOTLIN_STDLIB, PLAY_SERVICES_AUTH_API_PHONE, PLAY_SERVICES_BASEMENT,
                    PLAY_SERVICES_TASKS, RECAPTCHA)),

            new BuiltInLibrary(FIREBASE_AUTH_INTEROP, List.of(FIREBASE_ANNOTATIONS,
                    FIREBASE_COMMON, PLAY_SERVICES_BASEMENT, PLAY_SERVICES_TASKS)),

            new BuiltInLibrary(FIREBASE_COMMON, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_CONCURRENT_FUTURES, DATASTORE_PREFERENCES_ANDROID,
                    FIREBASE_ANNOTATIONS, FIREBASE_COMPONENTS,
                    KOTLINX_COROUTINES_PLAY_SERVICES, KOTLIN_STDLIB,
                    PLAY_SERVICES_BASEMENT, PLAY_SERVICES_TASKS), "com.google.firebase"),

            new BuiltInLibrary(FIREBASE_COMPONENTS, List.of(ANDROIDX_ANNOTATION_JVM,
                    ERROR_PRONE_ANNOTATIONS, FIREBASE_ANNOTATIONS)),

            new BuiltInLibrary(FIREBASE_DATABASE, List.of(ANDROIDX_ANNOTATION_JVM,
                    FIREBASE_APPCHECK_INTEROP, FIREBASE_AUTH_INTEROP, FIREBASE_COMMON,
                    FIREBASE_COMPONENTS, FIREBASE_DATABASE_COLLECTION,
                    KOTLINX_COROUTINES_CORE_JVM, KOTLIN_STDLIB, PLAY_SERVICES_BASE,
                    PLAY_SERVICES_BASEMENT, PLAY_SERVICES_TASKS)),

            new BuiltInLibrary(FIREBASE_DATABASE_COLLECTION, List.of(PLAY_SERVICES_BASE)),

            new BuiltInLibrary(FIREBASE_DATATRANSPORT, List.of(ANDROIDX_ANNOTATION_JVM,
                    TRANSPORT_API, TRANSPORT_BACKEND_CCT, TRANSPORT_RUNTIME)),

            new BuiltInLibrary(FIREBASE_ENCODERS, List.of(ANDROIDX_ANNOTATION_JVM)),

            new BuiltInLibrary(FIREBASE_ENCODERS_JSON, List.of(ANDROIDX_ANNOTATION_JVM,
                    FIREBASE_ENCODERS)),

            new BuiltInLibrary(FIREBASE_ENCODERS_PROTO, List.of(ANDROIDX_ANNOTATION_JVM,
                    FIREBASE_ENCODERS)),

            new BuiltInLibrary(FIREBASE_IID_INTEROP, List.of(PLAY_SERVICES_BASEMENT,
                    PLAY_SERVICES_TASKS)),

            new BuiltInLibrary(FIREBASE_INSTALLATIONS, List.of(FIREBASE_ANNOTATIONS,
                    FIREBASE_COMMON, FIREBASE_COMPONENTS, FIREBASE_INSTALLATIONS_INTEROP,
                    KOTLIN_STDLIB, PLAY_SERVICES_TASKS)),

            new BuiltInLibrary(FIREBASE_INSTALLATIONS_INTEROP, List.of(FIREBASE_ANNOTATIONS,
                    PLAY_SERVICES_TASKS)),

            new BuiltInLibrary(FIREBASE_MEASUREMENT_CONNECTOR, List.of(FIREBASE_ANNOTATIONS,
                    PLAY_SERVICES_BASEMENT)),

            new BuiltInLibrary(FIREBASE_MESSAGING, List.of(ANDROIDX_ANNOTATION_JVM,
                    ERROR_PRONE_ANNOTATIONS, FIREBASE_COMMON, FIREBASE_COMPONENTS,
                    FIREBASE_DATATRANSPORT, FIREBASE_ENCODERS, FIREBASE_ENCODERS_JSON,
                    FIREBASE_ENCODERS_PROTO, FIREBASE_IID_INTEROP, FIREBASE_INSTALLATIONS,
                    FIREBASE_INSTALLATIONS_INTEROP, FIREBASE_MEASUREMENT_CONNECTOR,
                    KOTLIN_STDLIB, PLAY_SERVICES_BASE, PLAY_SERVICES_BASEMENT,
                    PLAY_SERVICES_CLOUD_MESSAGING, PLAY_SERVICES_STATS, PLAY_SERVICES_TASKS,
                    TRANSPORT_API, TRANSPORT_BACKEND_CCT,
                    TRANSPORT_RUNTIME), "com.google.firebase.messaging"),

            new BuiltInLibrary(FIREBASE_STORAGE, List.of(ANDROIDX_ANNOTATION_JVM,
                    FIREBASE_ANNOTATIONS, FIREBASE_APPCHECK, FIREBASE_APPCHECK_INTEROP,
                    FIREBASE_AUTH_INTEROP, FIREBASE_COMMON, FIREBASE_COMPONENTS,
                    KOTLINX_COROUTINES_CORE_JVM, KOTLIN_STDLIB, PLAY_SERVICES_BASE,
                    PLAY_SERVICES_TASKS)),

            new BuiltInLibrary(GLIDE, List.of(ANDROIDX_EXIFINTERFACE, ANDROIDX_FRAGMENT,
                    ANDROIDX_TRACING, ANDROIDX_VECTORDRAWABLE_ANIMATED, GLIDE_ANNOTATIONS,
                    GLIDE_DISKLRUCACHE, GLIDE_GIFDECODER), "com.bumptech.glide"),

            new BuiltInLibrary(GLIDE_ANNOTATIONS),

            new BuiltInLibrary(GLIDE_DISKLRUCACHE),

            new BuiltInLibrary(GLIDE_GIFDECODER, List.of(ANDROIDX_ANNOTATION_JVM)),

            new BuiltInLibrary(GOOGLEID, List.of(KOTLIN_STDLIB)),

            new BuiltInLibrary(GSON, List.of(ERROR_PRONE_ANNOTATIONS)),

            new BuiltInLibrary(GUAVA, List.of(CHECKER_QUAL, ERROR_PRONE_ANNOTATIONS,
                    FAILUREACCESS, J2OBJC_ANNOTATIONS, JSR305)),

            new BuiltInLibrary(HTTP_LEGACY_ANDROID),

            new BuiltInLibrary(INTEGRITY, List.of(CORE_COMMON, PLAY_SERVICES_BASEMENT,
                    PLAY_SERVICES_TASKS)),

            new BuiltInLibrary(J2OBJC_ANNOTATIONS),

            new BuiltInLibrary(JAVAX_INJECT),

            new BuiltInLibrary(JETBRAINS_ANNOTATIONS),

            new BuiltInLibrary(KOTLINX_COROUTINES_ANDROID, List.of(KOTLINX_COROUTINES_CORE_JVM,
                    KOTLIN_STDLIB)),

            new BuiltInLibrary(KOTLINX_COROUTINES_CORE_JVM, List.of(JETBRAINS_ANNOTATIONS,
                    KOTLIN_STDLIB)),

            new BuiltInLibrary(KOTLINX_COROUTINES_PLAY_SERVICES, List.of(KOTLINX_COROUTINES_CORE_JVM,
                    KOTLIN_STDLIB, PLAY_SERVICES_TASKS)),

            new BuiltInLibrary(KOTLINX_SERIALIZATION_CORE_JVM, List.of(KOTLIN_STDLIB)),

            new BuiltInLibrary(KOTLIN_ANDROID_EXTENSIONS_RUNTIME, List.of(KOTLIN_STDLIB)),

            new BuiltInLibrary(KOTLIN_PARCELIZE_RUNTIME, List.of(KOTLIN_ANDROID_EXTENSIONS_RUNTIME,
                    KOTLIN_STDLIB)),

            new BuiltInLibrary(KOTLIN_STDLIB, List.of(JETBRAINS_ANNOTATIONS)),

            new BuiltInLibrary(JSPECIFY),

            new BuiltInLibrary(JSR305),

            new BuiltInLibrary(LOTTIE, List.of(ANDROIDX_APPCOMPAT, OKIO_JVM), "com.airbnb.lottie"),

            new BuiltInLibrary(MATERIAL, List.of(ANDROIDX_ACTIVITY,
                    ANDROIDX_ANNOTATION_EXPERIMENTAL, ANDROIDX_ANNOTATION_JVM, ANDROIDX_APPCOMPAT,
                    ANDROIDX_CARDVIEW, ANDROIDX_CONSTRAINTLAYOUT, ANDROIDX_COORDINATORLAYOUT,
                    ANDROIDX_CORE, ANDROIDX_DRAWERLAYOUT, ANDROIDX_DYNAMICANIMATION, ANDROIDX_FRAGMENT,
                    ANDROIDX_GRAPHICS_SHAPES_ANDROID, LIFECYCLE_RUNTIME_ANDROID,
                    ANDROIDX_RECYCLERVIEW, ANDROIDX_TRANSITION, ANDROIDX_VECTORDRAWABLE,
                    ANDROIDX_VIEWPAGER2, ERROR_PRONE_ANNOTATIONS,
                    KOTLIN_STDLIB), "com.google.android.material"),

            new BuiltInLibrary(OKHTTP_ANDROID, List.of(ANDROIDX_ANNOTATION_JVM,
                    ANDROIDX_STARTUP_RUNTIME, KOTLIN_STDLIB, OKIO_JVM)),

            new BuiltInLibrary(OKIO_JVM, List.of(KOTLIN_STDLIB)),

            new BuiltInLibrary(OTPVIEW, List.of(ANDROIDX_APPCOMPAT,
                    ANDROIDX_CORE_KTX), "affan.ahmad.otp"),

            new BuiltInLibrary(PATTERN_LOCK_VIEW, List.of(ANDROIDX_CORE,
                    JETBRAINS_ANNOTATIONS), "com.andrognito.patternlockview"),

            new BuiltInLibrary(PLAY_SERVICES_ADS, List.of(ANDROIDX_ADS_ADSERVICES,
                    ANDROIDX_ADS_ADSERVICES_JAVA, ANDROIDX_BROWSER, ANDROIDX_COLLECTION_JVM,
                    ANDROIDX_CORE, DATASTORE_ANDROID, ANDROIDX_WEBKIT,
                    KOTLINX_COROUTINES_ANDROID, KOTLINX_COROUTINES_CORE_JVM,
                    KOTLIN_STDLIB, PLAY_SERVICES_ADS_API, PLAY_SERVICES_ADS_IDENTIFIER,
                    PLAY_SERVICES_APPSET, PLAY_SERVICES_BASEMENT,
                    PLAY_SERVICES_TASKS), "com.google.android.gms.ads.impl"),

            new BuiltInLibrary(PLAY_SERVICES_ADS_API, List.of(ANDROIDX_BROWSER, ANDROIDX_CORE,
                    DATASTORE_ANDROID, ANDROIDX_WORK_RUNTIME,
                    KOTLINX_COROUTINES_ANDROID, KOTLINX_COROUTINES_CORE_JVM,
                    KOTLIN_STDLIB, PLAY_SERVICES_BASEMENT, PLAY_SERVICES_MEASUREMENT_SDK_API,
                    USER_MESSAGING_PLATFORM), "com.google.android.gms.ads"),

            new BuiltInLibrary(PLAY_SERVICES_ADS_BASE),

            new BuiltInLibrary(PLAY_SERVICES_ADS_IDENTIFIER, List.of(PLAY_SERVICES_BASEMENT)),

            new BuiltInLibrary(PLAY_SERVICES_ADS_LITE, List.of(ANDROIDX_WORK_RUNTIME,
                    PLAY_SERVICES_ADS_BASE, PLAY_SERVICES_BASEMENT, PLAY_SERVICES_MEASUREMENT_SDK_API,
                    USER_MESSAGING_PLATFORM), "com.google.android.gms.ads"),

            new BuiltInLibrary(PLAY_SERVICES_APPSET, List.of(PLAY_SERVICES_BASE,
                    PLAY_SERVICES_BASEMENT, PLAY_SERVICES_TASKS)),

            new BuiltInLibrary(PLAY_SERVICES_AUTH, List.of(ANDROIDX_FRAGMENT, ANDROIDX_LOADER,
                    KOTLINX_COROUTINES_ANDROID, KOTLINX_COROUTINES_CORE_JVM,
                    KOTLINX_COROUTINES_PLAY_SERVICES, KOTLIN_STDLIB,
                    PLAY_SERVICES_AUTH_API_PHONE, PLAY_SERVICES_AUTH_BASE, PLAY_SERVICES_BASE,
                    PLAY_SERVICES_BASEMENT, PLAY_SERVICES_FIDO,
                    PLAY_SERVICES_TASKS), "com.google.android.gms.auth.api"),

            new BuiltInLibrary(PLAY_SERVICES_AUTH_API_PHONE, List.of(PLAY_SERVICES_BASE,
                    PLAY_SERVICES_BASEMENT, PLAY_SERVICES_TASKS)),

            new BuiltInLibrary(PLAY_SERVICES_AUTH_BASE, List.of(ANDROIDX_COLLECTION_JVM,
                    PLAY_SERVICES_BASE, PLAY_SERVICES_BASEMENT, PLAY_SERVICES_TASKS)),

            new BuiltInLibrary(PLAY_SERVICES_BASE, List.of(ANDROIDX_COLLECTION_JVM, ANDROIDX_CORE,
                    ANDROIDX_FRAGMENT, PLAY_SERVICES_BASEMENT,
                    PLAY_SERVICES_TASKS), "com.google.android.gms.base"),

            new BuiltInLibrary(PLAY_SERVICES_BASEMENT, List.of(ANDROIDX_COLLECTION_JVM,
                    ANDROIDX_CORE, ANDROIDX_FRAGMENT), "com.google.android.gms.common"),

            new BuiltInLibrary(PLAY_SERVICES_CLOUD_MESSAGING, List.of(PLAY_SERVICES_BASEMENT,
                    PLAY_SERVICES_TASKS)),

            new BuiltInLibrary(PLAY_SERVICES_FIDO, List.of(PLAY_SERVICES_BASE,
                    PLAY_SERVICES_BASEMENT, PLAY_SERVICES_TASKS)),

            new BuiltInLibrary(PLAY_SERVICES_GASS, List.of(PLAY_SERVICES_ADS_BASE,
                    PLAY_SERVICES_ADS_IDENTIFIER, PLAY_SERVICES_ADS_LITE, PLAY_SERVICES_BASEMENT,
                    PLAY_SERVICES_TASKS)),

            new BuiltInLibrary(PLAY_SERVICES_GCM, List.of(ANDROIDX_COLLECTION_JVM, ANDROIDX_CORE,
                    ANDROIDX_LEGACY_SUPPORT_CORE_UTILS, PLAY_SERVICES_BASE, PLAY_SERVICES_BASEMENT,
                    PLAY_SERVICES_IID, PLAY_SERVICES_STATS), "com.google.android.gms.gcm"),

            new BuiltInLibrary(PLAY_SERVICES_IID, List.of(ANDROIDX_COLLECTION_JVM, ANDROIDX_CORE,
                    PLAY_SERVICES_BASE, PLAY_SERVICES_BASEMENT, PLAY_SERVICES_STATS,
                    PLAY_SERVICES_TASKS)),

            new BuiltInLibrary(PLAY_SERVICES_LOCATION, List.of(KOTLINX_COROUTINES_ANDROID,
                    KOTLINX_COROUTINES_CORE_JVM, KOTLIN_STDLIB, PLAY_SERVICES_BASE,
                    PLAY_SERVICES_BASEMENT, PLAY_SERVICES_TASKS)),

            new BuiltInLibrary(PLAY_SERVICES_MAPS, List.of(ANDROIDX_COLLECTION_JVM,
                    ANDROIDX_FRAGMENT, PLAY_SERVICES_BASE, PLAY_SERVICES_BASEMENT,
                    PLAY_SERVICES_TASKS), "com.google.android.gms.maps"),

            new BuiltInLibrary(PLAY_SERVICES_MEASUREMENT_BASE, List.of(PLAY_SERVICES_BASEMENT)),

            new BuiltInLibrary(PLAY_SERVICES_MEASUREMENT_SDK_API, List.of(PLAY_SERVICES_BASEMENT,
                    PLAY_SERVICES_MEASUREMENT_BASE)),

            new BuiltInLibrary(PLAY_SERVICES_PLACES_PLACEREPORT, List.of(PLAY_SERVICES_BASEMENT)),

            new BuiltInLibrary(PLAY_SERVICES_STATS, List.of(ANDROIDX_LEGACY_SUPPORT_CORE_UTILS,
                    PLAY_SERVICES_BASEMENT)),

            new BuiltInLibrary(PLAY_SERVICES_TASKS, List.of(PLAY_SERVICES_BASEMENT)),

            new BuiltInLibrary(RECAPTCHA, List.of(INTEGRITY, KOTLINX_COROUTINES_ANDROID,
                    KOTLINX_COROUTINES_PLAY_SERVICES, KOTLIN_STDLIB,
                    PLAY_SERVICES_BASEMENT, PLAY_SERVICES_TASKS)),

            new BuiltInLibrary(TRANSPORT_API, List.of(ANDROIDX_ANNOTATION_JVM)),

            new BuiltInLibrary(TRANSPORT_BACKEND_CCT, List.of(ANDROIDX_ANNOTATION_JVM,
                    FIREBASE_ENCODERS, FIREBASE_ENCODERS_JSON, TRANSPORT_API, TRANSPORT_RUNTIME)),

            new BuiltInLibrary(TRANSPORT_RUNTIME, List.of(ANDROIDX_ANNOTATION_JVM,
                    FIREBASE_ENCODERS, FIREBASE_ENCODERS_PROTO, JAVAX_INJECT, TRANSPORT_API)),

            new BuiltInLibrary(USER_MESSAGING_PLATFORM, List.of(ANDROIDX_ANNOTATION_JVM,
                    PLAY_SERVICES_BASEMENT)),

            new BuiltInLibrary(WAVE_SIDE_BAR, List.of(), "com.sayuti.lib"),

    };

    public static File getLibraryPath(String libraryName) {
        return new File(EXTRACTED_BUILT_IN_LIBRARIES_PATH, libraryName);
    }

    public static String getLibraryPathString(String libraryName) {
        return getLibraryPath(libraryName).getAbsolutePath();
    }

    public static File getLibraryClassesJarPath(String libraryName) {
        return new File(getLibraryPath(libraryName), "classes.jar");
    }

    public static String getLibraryClassesJarPathString(String libraryName) {
        return getLibraryClassesJarPath(libraryName).getAbsolutePath();
    }

    public static File getLibraryDexFile(String libraryName) {
        return new File(EXTRACTED_BUILT_IN_LIBRARY_DEX_FILES_PATH, libraryName + ".dex");
    }

    public static String getLibraryDexFilePath(String libraryName) {
        return new File(EXTRACTED_BUILT_IN_LIBRARY_DEX_FILES_PATH, libraryName + ".dex").getAbsolutePath();
    }

    /**
     * @throws IllegalArgumentException Thrown if the specified library doesn't have any assets.
     */
    public static File getLibraryAssets(String libraryName) {
        Jp library = new Jp(libraryName);

        if (library.hasAssets()) {
            return new File(EXTRACTED_BUILT_IN_LIBRARIES_PATH, libraryName + File.separator + "assets");
        } else {
            throw new IllegalArgumentException("Built-in library '" + libraryName + "' doesn't have any assets.");
        }
    }

    /**
     * @throws IllegalArgumentException Thrown if the specified library doesn't have any assets.
     */
    public static String getLibraryAssetsPath(String libraryName) {
        return getLibraryAssets(libraryName).getAbsolutePath();
    }

    public static File getLibraryResources(String libraryName) {
        Jp library = new Jp(libraryName);

        if (library.hasResources()) {
            return new File(EXTRACTED_BUILT_IN_LIBRARIES_PATH, libraryName + File.separator + "res");
        } else {
            throw new IllegalArgumentException("Built-in library '" + libraryName + "' doesn't have any resources.");
        }
    }

    public static String getLibraryResourcesPath(String libraryName) {
        return getLibraryResources(libraryName).getAbsolutePath();
    }

    public static File getLibraryProguardConfiguration(String libraryName) {
        return new File(EXTRACTED_BUILT_IN_LIBRARIES_PATH, libraryName + File.separator + "proguard.txt");
    }

    public static String getLibraryProguardConfigurationPath(String libraryName) {
        return getLibraryProguardConfiguration(libraryName).getAbsolutePath();
    }

    public static void extractCompileAssets(@NonNull BuildProgressReceiver... progressReceivers) {
        if (!EXTRACTED_COMPILE_ASSETS_PATH.exists()) {
            if (!EXTRACTED_COMPILE_ASSETS_PATH.mkdirs()) {
                throw new RuntimeException(new IOException("Failed to create directory " + EXTRACTED_COMPILE_ASSETS_PATH));
            }
        }

        String dexsArchiveName = "dexs.zip";
        String libsArchiveName = "libs.zip";
        String testkeyArchiveName = "testkey.zip";

        String dexsArchivePath = new File(BuiltInLibraries.EXTRACTED_COMPILE_ASSETS_PATH, dexsArchiveName).getAbsolutePath();
        String libsArchivePath = new File(BuiltInLibraries.EXTRACTED_COMPILE_ASSETS_PATH, libsArchiveName).getAbsolutePath();
        String testkeyArchivePath = new File(BuiltInLibraries.EXTRACTED_COMPILE_ASSETS_PATH, testkeyArchiveName).getAbsolutePath();
        String dexsDirectoryPath = BuiltInLibraries.EXTRACTED_BUILT_IN_LIBRARY_DEX_FILES_PATH.getAbsolutePath();
        String libsDirectoryPath = BuiltInLibraries.EXTRACTED_BUILT_IN_LIBRARIES_PATH.getAbsolutePath();
        String testkeyDirectoryPath = new File(BuiltInLibraries.EXTRACTED_COMPILE_ASSETS_PATH, "testkey").getAbsolutePath();

        String baseAssetsPath = "libs" + File.separator;
        oB fileUtil = new oB(false);

        maybeExtractAndroidJar(progressReceivers);

        if (ProjectBuilder.hasFileChanged(baseAssetsPath + dexsArchiveName, dexsArchivePath)) {
            for (BuildProgressReceiver receiver : progressReceivers) {
                receiver.onProgress("Extracting built-in libraries' DEX files...", 4);
            }
            /* Delete the directory */
            fileUtil.b(dexsDirectoryPath);
            /* Create the directories */
            fileUtil.f(dexsDirectoryPath);
            /* Extract dexs.zip to dexs/ */
            new KB().a(dexsArchivePath, dexsDirectoryPath);
        }
        if (ProjectBuilder.hasFileChanged(baseAssetsPath + libsArchiveName, libsArchivePath)) {
            for (BuildProgressReceiver receiver : progressReceivers) {
                receiver.onProgress("Extracting built-in libraries' resources...", 5);
            }
            /* Delete the directory */
            fileUtil.b(libsDirectoryPath);
            /* Create the directories */
            fileUtil.f(libsDirectoryPath);
            /* Extract libs.zip to libs/ */
            new KB().a(libsArchivePath, libsDirectoryPath);
        }
        maybeExtractCoreLambdaStubsJar();
        if (ProjectBuilder.hasFileChanged(baseAssetsPath + testkeyArchiveName, testkeyArchivePath)) {
            for (BuildProgressReceiver receiver : progressReceivers) {
                receiver.onProgress("Extracting built-in signing keys...", 6);
            }
            /* Delete the directory */
            fileUtil.b(testkeyDirectoryPath);
            /* Create the directories */
            fileUtil.f(testkeyDirectoryPath);
            /* Extract testkey.zip to testkey/ */
            new KB().a(testkeyArchivePath, testkeyDirectoryPath);
        }
    }

    public static void maybeExtractAndroidJar(@NonNull BuildProgressReceiver... receivers) {
        String androidJarArchiveName = "android.jar.zip";
        String androidJarPath = new File(EXTRACTED_COMPILE_ASSETS_PATH, androidJarArchiveName).getAbsolutePath();
        if (ProjectBuilder.hasFileChanged("libs" + File.separator + androidJarArchiveName, androidJarPath)) {
            for (BuildProgressReceiver receiver : receivers) {
                receiver.onProgress("Extracting built-in android.jar...", 7);
            }
            /* Delete android.jar */
            new oB().c(EXTRACTED_COMPILE_ASSETS_PATH.getAbsolutePath() + File.separator + "android.jar");
            /* Extract android.jar.zip to android.jar */
            new KB().a(androidJarPath, EXTRACTED_COMPILE_ASSETS_PATH.getAbsolutePath());
        }
    }

    public static void maybeExtractCoreLambdaStubsJar() {
        String coreLambdaStubsJarName = "core-lambda-stubs.jar";
        String coreLambdaStubsJarPath = new File(BuiltInLibraries.EXTRACTED_COMPILE_ASSETS_PATH, coreLambdaStubsJarName).getAbsolutePath();
        ProjectBuilder.hasFileChanged("libs" + File.separator + coreLambdaStubsJarName, coreLambdaStubsJarPath);
    }

    public static class BuiltInLibrary implements Parcelable {
        public static final Creator<BuiltInLibrary> CREATOR = new Creator<>() {
            @Override
            public BuiltInLibrary createFromParcel(Parcel in) {
                return new BuiltInLibrary(in);
            }

            @Override
            public BuiltInLibrary[] newArray(int size) {
                return new BuiltInLibrary[size];
            }
        };
        private final String name;
        private final List<String> dependencyNames;
        private final String packageName;
        private final boolean hasResources;

        /**
         * @param packageName Can be {@code null} for no resources, though then
         * {@link #BuiltInLibrary(String, List)} is advised.
         */
        public BuiltInLibrary(String name, List<String> dependencyNames, String packageName) {
            this.name = name;
            this.dependencyNames = dependencyNames;
            this.packageName = packageName;
            hasResources = packageName != null;
        }

        /**
         * Constructs a {@link BuiltInLibrary} with specified dependencies but no resources.
         */
        public BuiltInLibrary(String name, List<String> dependencyNames) {
            this(name, dependencyNames, null);
        }

        /**
         * Constructs a {@link BuiltInLibrary} with no dependencies and resources.
         */
        public BuiltInLibrary(String name) {
            this(name, List.of());
        }

        protected BuiltInLibrary(Parcel in) {
            name = in.readString();
            dependencyNames = in.createStringArrayList();
            packageName = in.readString();
            hasResources = in.readInt() != 0;
        }

        public static Optional<BuiltInLibrary> ofName(String name) {
            for (BuiltInLibrary builtInLibrary : KNOWN_BUILT_IN_LIBRARIES) {
                if (builtInLibrary.getName().equals(name)) {
                    return Optional.of(builtInLibrary);
                }
            }

            return Optional.empty();
        }

        public String getName() {
            return name;
        }

        public List<String> getDependencyNames() {
            return dependencyNames;
        }

        public Optional<String> getPackageName() {
            return packageName == null ? Optional.empty() : Optional.of(packageName);
        }

        public boolean hasResources() {
            return hasResources;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BuiltInLibrary that = (BuiltInLibrary) o;
            return name.equals(that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        @NonNull
        public String toString() {
            return "BuiltInLibrary{" +
                    "name='" + name + '\'' +
                    ", dependencyNames=" + dependencyNames +
                    ", packageName='" + packageName + '\'' +
                    ", hasResources=" + hasResources +
                    '}';
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(name);
            dest.writeStringList(dependencyNames);
            dest.writeString(packageName);
            dest.writeInt(hasResources ? 1 : 0);
        }
    }
}
