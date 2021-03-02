package com.example.androiddevchallenge.model

import android.os.Parcelable
import androidx.compose.runtime.Immutable
import kotlinx.parcelize.Parcelize

@Immutable
@Parcelize
data class Dog(
    val name: String,
    val breed: String,
    val description: String,
    val imageUrl: String,
    val location: String,
) : Parcelable

val dogList = listOf(
    Dog(
        name = "Lily",
        breed = "Teddy",
        description = "Teddy is actually a poodle. The English name is Canis lupus familiaris. It is not a breed of dog. It refers to the name of a way of grooming poodles --- \"Teddy dress.\" The characteristic of the Teddy outfit is that it does not shave its mouth, and its hair is artificially trimmed to be very similar to the teddy bear toy in the window. It is precisely because this shape is loved and sought after by everyone, so this style of grooming poodle Call it \"Teddy Dog\". Poodles are French breeds and are divided into four categories according to their size. The most popular are the smaller mini poodles and toy poodles.The teddy dog \u200B\u200Bhas a cube structure, and most of its head will be trimmed to form an oval or round shape. The ratio of shoulder height to body length is basically 9:11. Basically, the tail will be docked after birth. With curly hair, this species can be simply divided into two body shapes: toy body (adult with shoulder height no more than 25cm) and teacup body (adult with shoulder height no more than 18cm).Lively, cheerful, clever, smart, very good-tempered, like to go out, and have a strong adaptability. Very easy to get close to people and quite faithful. Agile movements, elegant posture, confident and powerful steps, well-proportioned. ",
        imageUrl = "https://t10.baidu.com/it/u=4213725822,363923464&fm=173&app=25&f=JPEG?w=508&h=505&s=DD110CD74C52B5D002AF102F0300E049",
        location = "Germany, France"
    ),
    Dog(
        name = "Lulu",
        breed = "Samoyed",
        description = "The Samoyed dog is very delicate, with a cute and charming smile, attractive appearance and strong physique, which make people have a profound influence on it, especially before one year old, it is naughty and smart, very affectionate.At first, Samoyeds had different coat colors, such as black, black and white, and dark brown. However, in the 19th century, fur traders thought that white would be the most popular, so only white Samoyeds were exported to Europe, America and other countries in large quantities.Nowadays, most people choose to raise Samoyed, mainly because they think it has a good character and will not affect the relationship between neighbors. Although Samoyed dogs are strong, they never take the initiative to cause trouble, and are very friendly to other animals or humans. Always stay quiet, as long as the other party does not deliberately provoke it, it will never provoke it. Although he is passionate about humans, he is also very measured, not too clingy, and seldom puts his paws on people at every turn.This may be related to its past living environment, because in the icy and snowy climate, humans do not like to keep dogs running over to show affection at every turn. Therefore, Samoyed has also become accustomed to this way of getting along during a long time. Gradually become more and more quiet. Of course, this is just a personal guess, maybe it's not necessarily because of nature.Samoyed dogs have vigorous energy, but they never bark loudly for no reason, so they are suitable for living in urban families, and parents do not have to worry about it disturbing the people.However, they are likely to be curious or bored and \"expedition\" at home, turning the house upside down. However, I believe that compared with barking, parents should be more willing to clean up the mess after going home. After all, they won't disturb others, so they don't need to apologize with presents from time to time. ",
        imageUrl = "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=252508846,511445715&fm=26&gp=0.jpg",
        location = "Siberia"
    ),
    Dog(
        name = "Jack",
        breed = "Golden Retriever",
        description = "The Golden Retriever is a well-proportioned, powerful, and lively dog breed. It is characterized by a stable structure, reasonable and coordinated proportions of various body parts, legs that are neither too long but also clumsy, friendly, enthusiastic, alert, confident, and not afraid of life.The Golden Retriever was originally a retriever. Most of them are now raised as guide dogs and pet dogs. The Golden Retriever ranks fourth on the canine IQ rankings. Very friendly to children or babies.Friendly, reliable and trustworthy. Under natural circumstances, showing aggressiveness or hostility towards other dogs or people: if it is unreasonable timidity and nervousness, it is contrary to the characteristics of the golden retriever. According to the severity of the situation, the competition will be punished. of. ",
        imageUrl = "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2055716313,1812363669&fm=26&gp=0.jpg",
        location = "United Kingdom "
    ),
    Dog(
        name = "Jamas",
        breed = "Horse dog",
        description = "Horse dog, Belgian Malinois, English name: Belgian Malinois, alias: Malinois. It is the only short-haired breed among the four types of Belgian Sheepdogs, with a long history and a long-standing reputation. Because of its outstanding features such as good obedience, excitement, high alertness, quick smell, boldness and ferocity, strong offensive power, high desire to capture, good jumping ability, and strong adaptability, it is favored by police and military from all over the world. , Can be used for tracking, anti-narcotics, security, escort, escort, etc. It is commonly used for search, escort and other tasks in the United States. Is the most loyal friend of mankind.Lively and excited. Bold and fierce, aggressive, alert, strong in search reflex, strong desire to acquire, possessive, intelligent, very good memory, very energetic.Good working nature, strong desire to work, quick response, docile, loyal, confident and responsible. In the new environment, it is neither timid nor aggressive, and it can adapt quickly to the new environment whether it is in the city or in the country. Like to get along with familiar people, may produce behavior that cannot tolerate other dogs and strangers.",
        imageUrl = "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3182225842,63092480&fm=26&gp=0.jpg",
        location = "Belgium "
    ),
    Dog(
        name = "Hope",
        breed = "Siberian Husky",
        description = "Siberian Husky, English name: SIBERIAN HUSKY, alias: Husky, is a primitive and ancient dog breed, mainly living in northeastern Siberia and southern Greenland. The name of the Husky is derived from its unique hoarse call.Huskies have a changeable personality, some are very timid, some are very violent, but now that the huskies integrated into the mainland and family have wiped out its wildness and become more docile, it is a popular pet dog all over the world.Friendly, gentle, alert, smart, docile, enthusiastic and likes to socialize. It will not show the strong territorial possessiveness of guard dogs, will not have too much suspicion towards strangers, and will not be aggressive towards other dogs. Adult dogs should possess a certain degree of caution and dignity.",
        imageUrl = "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1169911340,907722151&fm=26&gp=0.jpg",
        location = "Russia"
    ),
    Dog(
        name = "Happiness",
        breed = "Niutou Terrier",
        description = "Niutou Terrier, this breed has two strains-white Niutou Terrier and colored Niutou Terrier. The origin of this species can be traced back to 1835. Everyone believes that this breed was bred from the now extinct British White Terrier. A few years later, in order to meet its appearance standards, the dog was crossed with the Spanish indicator dog, and now the genetic characteristics of the indicator dog can be occasionally found on the dog's body.Bull Terriers are bred for gentlemen, so these gentlemen strongly demand fair play and not compete with fraudsters. The Bull Terrier is trained to defend itself bravely and protect its owner, but it is never allowed to try to challenge (the white breed is called the \"white knight\", which is its honor to this day).People who don't know the dog may not know the Bull Terrier. It is actually a very friendly dog. It relies on its good temperament to reproduce and prosper. Sometimes it will fight and play. Most people may prefer an animal that is relatively balanced in all aspects, rather than special in some aspects. But all in all, the Bull Terrier has the perfect character as a fighting dog. It is lively and agile, and very strong.Naturally active, with a very high degree of excitement, individual dogs or after artificial training will generally be combative, and never know how to give up in dogs. On the contrary, they even have aggressive behavior and hurt other dogs. However, the Bull Terrier is relatively docile, smart and obedient, and especially to the owner, very loyal and obedient, and very friendly, kind and patient to the children.",
        imageUrl = "https://bkimg.cdn.bcebos.com/pic/ca1349540923dd545b700019d209b3de9c8248bb?x-bce-process=image/watermark,image_d2F0ZXIvYmFpa2U5Mg==,g_7,xp_5,yp_5/format,f_auto",
        location = "United Kingdom "
    ),
)