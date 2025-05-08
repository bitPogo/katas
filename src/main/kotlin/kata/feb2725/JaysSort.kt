package kata.feb2725

fun solution(input: String): String = input.lines().mapIndexed { index, line ->
    val oldPhoto = parseOldPhoto(line)
    formatNewPhotoName(oldPhoto, index + 1)
}.joinToString("\n")

private fun formatNewPhotoName(oldPhoto: OldPhoto, nextNumber: Int): String =
    "${oldPhoto.cityName}$nextNumber.${oldPhoto.extension}"

private fun parseOldPhoto(oldPhoto: String): OldPhoto {
    val (photoNameWithExtension, city, dateTime) = oldPhoto.split(",")
    val (photoName, extension) = photoNameWithExtension.split(".")
    return OldPhoto(
        photoName = photoName.trim(),
        cityName = city.trim(),
        extension = extension.trim(),
        dateTime = dateTime.trim()
    )
}

data class OldPhoto(
    val photoName: String,
    val cityName: String,
    val extension: String,
    val dateTime: String,
)