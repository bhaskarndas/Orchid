package com.eden.orchid.kotlindoc.page

import com.eden.orchid.api.options.annotations.Archetype
import com.eden.orchid.api.options.archetypes.ConfigArchetype
import com.eden.orchid.api.theme.pages.OrchidPage
import com.eden.orchid.kotlindoc.KotlindocGenerator
import com.eden.orchid.kotlindoc.resources.BaseKotlindocResource

@Archetype(value = ConfigArchetype::class, key = "${KotlindocGenerator.GENERATOR_KEY}.pages")
abstract class BaseKotlindocPage(
        resource: BaseKotlindocResource,
        key: String,
        title: String
) : OrchidPage(resource, key, title)
