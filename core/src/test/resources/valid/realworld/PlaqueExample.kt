import kotlin.Any
import kotlin.Array
import kotlin.Boolean
import kotlin.Number
import kotlin.String

data class PlaqueExample(val data: Array<Any>, val meta: Meta)

data class Meta(val view: View)

data class View(
    val attribution: String,
    val attributionLink: String,
    val averageRating: Number,
    val category: String,
    val columns: Array<Columns>,
    val createdAt: Number,
    val description: String,
    val displayType: String,
    val downloadCount: Number,
    val flags: Array<String>,
    val grants: Array<Grants>,
    val hideFromCatalog: Boolean,
    val hideFromDataJson: Boolean,
    val iconUrl: String,
    val id: String,
    val indexUpdatedAt: Number,
    val license: License,
    val licenseId: String,
    val metadata: Metadata,
    val name: String,
    val newBackend: Boolean,
    val numberOfComments: Number,
    val oid: Number,
    val owner: Owner,
    val provenance: String,
    val publicationAppendEnabled: Boolean,
    val publicationDate: Number,
    val publicationGroup: Number,
    val publicationStage: String,
    val query: Query,
    val rights: Array<String>,
    val rowClass: String,
    val rowIdentifierColumnId: Number,
    val rowsUpdatedAt: Number,
    val rowsUpdatedBy: String,
    val tableAuthor: Owner,
    val tableId: Number,
    val totalTimesRated: Number,
    val viewCount: Number,
    val viewLastModified: Number,
    val viewType: String
)

data class TableAuthor(
    val id: String,
    val displayName: String,
    val profileImageUrlLarge: String,
    val profileImageUrlMedium: String,
    val profileImageUrlSmall: String,
    val screenName: String,
    val type: String,
    val flags: Array<String>
)

class Query

data class Owner(
    val id: String,
    val displayName: String,
    val profileImageUrlLarge: String,
    val profileImageUrlMedium: String,
    val profileImageUrlSmall: String,
    val screenName: String,
    val type: String,
    val flags: Array<String>
)

data class Metadata(
    val rdfSubject: String,
    val rdfClass: String,
    val custom_fields: Custom_fields,
    val rowIdentifier: String,
    val availableDisplayTypes: Array<String>,
    val renderTypeConfig: RenderTypeConfig
)

data class RenderTypeConfig(val visible: Visible)

data class Visible(val table: Boolean)

data class Custom_fields(val Publication: Publication, val AdditionalLicenceDetail: AdditionalLicenceDetail)

data class AdditionalLicenceDetail(
    val ReuserGuidelines: String,
    val AdditionalLicenceInformation: String,
    val LicenceURL: String
)

data class Publication(val UpdateFrequency: String)

data class License(val name: String)

data class Grants(
    val inherited: Boolean,
    val type: String,
    val flags: Array<String>
)

data class Columns(
    val id: Number,
    val name: String,
    val dataTypeName: String,
    val description: String,
    val fieldName: String,
    val position: Number,
    val renderTypeName: String,
    val tableColumnId: Number,
    val width: Number,
    val cachedContents: CachedContents,
    val format: Format,
    val subColumnTypes: Array<String>?
)

data class Format(val view: String, val align: String)

data class CachedContents(
        val non_null: Number,
        val largest: Largest,
        val _null: Number,
        val top: Array<Top>?,
        val smallest: Smallest
)

data class Smallest(val latitude: String, val longitude: String)

data class Top(val item: Item, val count: Number)

data class Item(val latitude: String, val longitude: String)

data class Largest(val latitude: String, val longitude: String)
