# Documentation Repository Contents

This repository is intended for storage of Liferay product documentation.
Documents are to be comprised of chapter source files in Markdown format.
Images referenced in the documents are to be stored in the appropriate images
directories.  Document sources are stored in directories for their appropriate
language (e.g., "en" for English).

Here is the repository's directory structure:

    liferay-docs/
     |____ [document dir]/ (e.g. userGuide/, devGuide/, soffice/)
     |      |____ [language dir]/ (e.g. 'en' for English, 'es' for Spanish)
     |      |      |
     |      |      |____ chapters/
     |      |      |      |____ [0-9][0-9]-[subject].markdown
     |      |      |            (e.g. 01-intro.markdown)        
     |      |      |
     |      |      |____ images/ (language specific versions of the default images)
     |      |
     |      |____ code/ (code examples)
     |      |____ drawings/ (source files, such as .odg files, for drawings)
     |      |____ images/ (default images for the document)
     |      |____ build.xml (boiler plate Ant build.file)
     |      |____ doc.properties (project metadata)
     |
     |____ code/ (code for custom Ant tasks)
     |____ guidelines/ (instructions on tools, Markdown conventions, and writing)
     |____ lib/ (JARs for custom Ant tasks)
     |
     |____ README
     |____ build-common.xml
     |____ build.properties
     |____ liferay-book-template.ott
     |____ liferay-book-template-tradepaperback.ott

## Document Format Conversion

Documents can be converted from markdown to HTML, epub and ODT formats using Ant
targets found in `build-common.xml`. Override default properties, found in
build.properties, by creating your own properties file
(e.g., `build.[username].properties`) to specify your desired property values.

The conversion targets create a build directory (e.g. `userGuide/build/`) for
the current document. This directory receives the Markdown source file, the
language specific image files, and the converted document.

# Required Software

* Ant: Required for executing Ant targets.  Download from ...
  http://ant.apache.org/bindownload.cgi

* Pandoc: Used in our Ant targets for conversions from Markdown to various
formats. See installation instructions at ...
  http://johnmacfarlane.net/pandoc/installing.html

# Conversion Steps

1.  Go to the directory of the document to be converted.

    Example - userGuide,

        cd liferay-docs/userGuide

2.  Execute a conversion target to produce the desired format of the document.

    Example - aggregate the chapters into a single Markdown file and convert to
    HTML. 

        ant markdown-to-html

    Example - convert a single Markdown chapter file (e.g. `01-intro.markdown`) to
    HTML by passing the file prefix (e.g. `01-intro`) as the value for the
    `chapter` property. 

        ant chapter-to-html -Dchapter=01-intro

List all of the ant targets by executing ...

    ant -projecthelp

Note, the Windows specific versions of the targets end in "-win"
(e.g., markdown-to-html-win).
	
Override the language property (i.e., lang), specified in the build.properties,
by either passing the language value to ant (e.g. `-Dlang=es`) or by specifying
the language in a name/value pair (e.g., `lang=es`) in your
`build.[user].properties`.

The conversion targets build the results to the respective build directory
`liferay-docs/[doc.name]/build/[lang]/`.

Example - build directory for the userGuide in English,

    liferay-docs/
     |____ userGuide/
            |____ build/
                   |____ en/
                   |      |____ userGuide.html
                   |      |____ userGuide.markdown
                   |      |____ userGuide.odt
                   |
                   |____ images/ (language specific images)

## Contributing Documentation

To contribute new material or bug fixes, please send pull requests to the
respective document managers:

- Using Liferay Portal (userGuide) - Rich Sezov (GitHub user: `sez11a`) 
- Developer's Guide (devGuide) - Jim Hinkey (GitHub user: `jhinkey`)
- Social Office (soffice) - Jesse Rao (GitHub user: `jrao`)

Here are the branches for the respective product releases:

- Liferay Portal 6.2 CE/EE - `master`
- Liferay Portal 6.1 CE/EE - `6.1.x`
